

/*
 * Class: CMSC203 CNR 46622 
 * Instructor: Prof.Grigoriy A. Grinberg
 * Description: 
 * Due: 07/10/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ABAYNEH MENGISTU
*/
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.event.EventTarget;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield.
	
	Label label1;
	TextField textF;
	Button button1,button2,button3,button4,button5,button6;
	
//  declare two HBoxes
	
	HBox hbox1,hbox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	
	DataManager dataMan =new DataManager();
	Insets inset = new Insets(5);
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		
		
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		
		button1 = new Button("Hello");
		button2 = new Button("howdy");
		button3 = new Button("chinese");
		button4 = new Button("clear");
		button5 = new Button("Exit");
		button6 = new Button("Amharic");
		textF = new TextField();
		label1 = new Label("Feedback:");
		
		//  instantiate the HBoxes
		
		hbox1 = new HBox();
		hbox2 = new HBox();
		
		button1.setOnAction(new handler());
		button2.setOnAction(new handler());
		button3.setOnAction(new handler());
		button4.setOnAction(new handler());
		button5.setOnAction(new handler());
		button6.setOnAction(new handler());
		
		//student Task #4:
		// instantiate the DataManager instance
		
		// set margins and set alignment of the components
	
		//student Task #3:
		hbox1.getChildren().addAll(label1, textF);
		hbox2.getChildren().addAll(button1, button2,button3, button4, button5,button6);
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox1.setMargin(textF, inset);
		hbox2.setMargin(button1, inset);
		hbox2.setMargin(button2, inset);
		hbox2.setMargin(button3, inset);
		hbox2.setMargin(button4, inset);
		hbox2.setMargin(button5, inset);
		hbox2.setMargin(button6, inset);
		
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(hbox1, hbox2);
		
		
	}
	
	//  Task #4:
	//  create a private inner class to handle the button clicks/*
	class handler implements EventHandler<ActionEvent>
	{
		
	
	public void handle(ActionEvent event) 
	{
		
	
		// Variables
		EventTarget eT = event.getTarget();

		// Checks
		if (eT == button1)
		{
			textF.setText(dataMan.getHello());
		}
		else if (eT == button2)
		{
			textF.setText(dataMan.getHowdy());
		} 
		else if (eT == button3) 
		{
			textF.setText(dataMan.getChinese());
		}
		else if (eT == button4)
		{
			textF.setText("");
		}
		else if (eT == button6)
		{
			textF.setText(dataMan.getAmharic());
		}
		else if (eT == button5)
		{
			Platform.exit();
			System.exit(0);
		}
		
	}
	}
	}
	

