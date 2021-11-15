package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Calculator extends Application {
	

	 double num;
	 double result;
	 String operation;

	@Override
	public void start(Stage primaryStage) throws Exception {

		 GridPane pain = new GridPane();

		 TextField enter = new TextField();
		 enter.setMinSize(35*5+20, 40);
		 enter.setAlignment(Pos.BASELINE_RIGHT);
		 pain.add(enter, 0, 0, 5, 2);
		 
		 Button btn0 = new Button("0");
		 btn0.setMinSize(35, 35);
		 
		 Button btn1 = new Button("1");
		 btn1.setMinSize(35, 35);
		 Button btn2 = new Button("2");
		 btn2.setMinSize(35, 35);
		 Button btn3 = new Button("3");
		 btn3.setMinSize(35, 35);
		 Button btn4 = new Button("4");
         btn4.setMinSize(35, 35);
	     Button btn5 = new Button("5");
		 btn5.setMinSize(35, 35);
	     Button btn6 = new Button("6");
	     btn6.setMinSize(35, 35);
   	     Button btn7 = new Button("7");
		 btn7.setMinSize(35, 35);
		 Button btn8 = new Button("8");
		 btn8.setMinSize(35, 35);
		 Button btn9 = new Button("9");
		 btn9.setMinSize(35, 35);
		   
		 Button btnPlus = new Button("+");
		 btnPlus.setMinSize(35, 35);
		 Button btnMinus = new Button("-");
		 btnMinus.setMinSize(35, 35);
		 Button btnMultiply = new Button("*");
		 btnMultiply.setMinSize(35, 35);
		 Button btnDivide = new Button("/");
		 btnDivide.setMinSize(35, 35);
		 Button btnEquals = new Button("=");
		 btnEquals.setMaxHeight(Double.MAX_VALUE);
		 btnEquals.setMaxWidth(Double.MAX_VALUE);
		    
		 Button btnDot = new Button(".");
		 btnDot.setMinSize(35, 35);
		 Button btnC = new Button("C");
		 btnC.setMinSize(35, 35);
		 Button btnPlusOrMinus = new Button("+/-");
		 btnPlusOrMinus.setMinSize(35, 35);
		 Button btnPercentage= new Button("%");
		 btnPercentage.setMinSize(35, 35);
		 
		 pain.add(btn7,0,3);
		 pain.add(btn8,1,3);
		 pain.add(btn9,2,3);
	     pain.add(btnDivide,3,3);
		 pain.add(btnPercentage,4,3);

		 pain.add(btn4,0,4);
		 pain.add(btn5,1,4);
		 pain.add(btn6,2,4);
		 pain.add(btnMultiply,3,4);
		 pain.add(btnC,4,4);
		    
		 pain.add(btn1,0,5);
		 pain.add(btn2,1,5);
		 pain.add(btn3,2,5);
		 pain.add(btnMinus,3,5);
		 pain.add(btnEquals,4,5,1,2);


		 pain.add(btnPlusOrMinus,0,6);
		 pain.add(btn0,1,6);
		 pain.add(btnDot,2,6);
		 pain.add(btnPlus,3,6);
		 
		
		 btn0.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn0.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn1.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn2.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn2.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn3.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn4.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn4.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn5.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn5.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn6.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn6.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn7.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String number = enter.getText() + btn7.getText();
				enter.setText(number);
			}
			 
		 });
		 
		 btn8.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn8.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btn9.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btn9.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 btnDot.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String number = enter.getText() + btnDot.getText();
					enter.setText(number);
				}
				 
			 });
		 
		 
		 btnC.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					
					enter.setText(null);
					enter.setText("");
				}
				 
			 });
		 
		 btnPlus.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					num = Double.parseDouble(enter.getText());
					enter.setText("");
					operation = "+";
				}
				 
			 });
		 
		 btnMinus.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					num = Double.parseDouble(enter.getText());
					enter.setText("");
					operation = "-";
				}
				 
			 });
		 
		 btnMultiply.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					num = Double.parseDouble(enter.getText());
					enter.setText("");
					operation = "*";
				}
				 
			 });
		 
		 btnDivide.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					num = Double.parseDouble(enter.getText());
					enter.setText("");
					operation = "/";
				}
				 
			 });
		 
		 btnPercentage.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					num = Double.parseDouble(enter.getText());
					result = num/100;
					enter.setText(String.valueOf(result));
					
				}
				 
			 });
		 
		 btnPlusOrMinus.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					double opposite = Double.parseDouble(String.valueOf(enter.getText()));
					opposite = -1 * opposite;
					enter.setText(String.valueOf(opposite));
				}
				 
			 });
		 
		 
		 btnEquals.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					double num2 = Double.parseDouble(enter.getText());
					if (operation == "+") {
						result = num + num2;
						enter.setText(String.valueOf(result));
					}
					else if (operation == "-") {
						result = num - num2;
						enter.setText(String.valueOf(result));
					}
					else if (operation == "*") {
						result = num * num2;
						enter.setText(String.valueOf(result));
					}
					else if (operation == "/") {  
						if (num2==0)
							enter.setText("error");
						else {
							result = num / num2;
							enter.setText(String.valueOf(result));
						}	
					}
					
					else {
						enter.setText("error");
					}
					
					
				}
				 
			 });
		 
		 
     
		 pain.setVgap(5);
		 pain.setHgap(5);
		 pain.setPadding(new Insets(5,5,5,5));
		 primaryStage.setTitle("Calculator");
		 primaryStage.setScene(new Scene(pain));
		 primaryStage.show();

	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}