
package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import application.MainController.ChatEntry;
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class MainController {
	@FXML
	private Label lblStatus;
	@FXML
	private TextField txtUserName;
	@FXML
	private TextField txtPassword;
	@FXML
	private WebView webView;
	@FXML
	private TextField textField;
	private WebEngine engine;
	private String homePage;
	private double webZoom;
	
	ObservableList<ChatEntry> messages;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webView.getEngine();
		homePage = "www.google.com";
		textField.setText(homePage);
		webZoom = 1;
	    loadPage();
	}
	public void loadPage() {
		engine.load("http://"+textField.getText());
		
	}
	public void Login(ActionEvent event) throws Exception{
		Stage primaryStage1 = new Stage();
		Parent root1 = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene1 = new Scene(root1,600,400);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage1.setScene(scene1);
		primaryStage1.show();

		
		if(txtUserName.getText().equals("user")&& txtPassword.getText().equals("pass")) {
		lblStatus.setText("Login Success");
		Stage primaryStage = new Stage();
		 messages = FXCollections.observableArrayList();
	        TextField textField = new TextField();
	        Button localButton = new Button("Local");
	        Button remoteButton = new Button("Remote");
	        ListView<ChatEntry> listView = new ListView<>();
	        listView.setCellFactory(list -> new ChatCell());
	        listView.setItems(messages);
	        localButton.setOnAction(evt -> messages.add(new ChatEntry(textField.getText(), MessageType.LOCAL)));
	        remoteButton.setOnAction(evt -> messages.add(new ChatEntry(textField.getText(), MessageType.REMOTE)));
	        Scene scene = new Scene(new VBox(10, listView, new HBox(remoteButton, textField, localButton)));
	       
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	
	else {
			lblStatus.setText("Login Failed");
		}
	}
		

	    enum MessageType {
	        LOCAL, REMOTE
	    }


	    static class ChatCell extends ListCell<ChatEntry> {

	        HBox graphic = new HBox();
	        Text message = new Text();

	        public ChatCell() {
	            graphic.getChildren().add(message);
	            getStyleClass().add("custom-list-cell");
	        }

	        @Override
	        public void updateItem(ChatEntry item, boolean empty) {
	            super.updateItem(item, empty);
	            if (!empty && (item != null)) {
	                message.setText(item.textProperty().get());
	                graphic.setAlignment(item.typeProperty().get().equals(MessageType.REMOTE) ? Pos.CENTER_LEFT : Pos.CENTER_RIGHT);
	                setGraphic(graphic);
	            } else {
	                message.setText("");
	                setGraphic(null);
	            }
	        }
	    }


	    static class ChatEntry {
	        private final StringProperty text = new SimpleStringProperty("");
	        private final ObjectProperty<MessageType> type = new SimpleObjectProperty<>();

	        public ChatEntry(String text, MessageType type) {
	            this.text.set(text);
	            this.type.set(type);
	        }

	        public StringProperty textProperty() {
	            return text;
	        }

	        public ObjectProperty<MessageType> typeProperty() {
	            return type;
	        }


	
}
}

