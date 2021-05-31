import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.TableView;

/**
 * JavaFX class Maingui.
 *
 * @author MuhammadRivaldiAlHajad
 * @version 01
 */
public class Maingui extends Application
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    //private Label myLabel = new Label("0");
    private Label hasilLabel1 = new Label("");
    private Label hasilLabel2 = new Label("");
    private Label hasilLabel3 = new Label("");
    private Label hasilLabel4 = new Label("");
    private TextField op1Tf = new TextField(); 
    private TextField op2Tf = new TextField();
    private Calculator calc = new Calculator();
   
     @Override
    public void start(Stage stage)
    {
        // Create a Button or any control item
        Button myButton1 = new Button("+");
        Button myButton2 = new Button("-");
        Button myButton3 = new Button("*");
        Button myButton4 = new Button("/");
        Label op1Label = new Label("OP A");
        Label op2Label = new Label("OP B");
       

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setMinSize(400, 400);
        pane.setVgap(20);
        pane.setHgap(20);
        
        

        //set an action on the button using method reference
        myButton1.setOnAction(this::buttonClick1);

        // Add the button and label into the pane
        pane.add(op1Label, 0, 0);
        pane.add(op1Tf, 1, 0);
        
        pane.add(op2Label, 0, 1);
        pane.add(op2Tf, 1, 1);
        
        pane.add(myButton1, 0, 2);
        pane.add(hasilLabel1, 1, 2);
        
        //set an action on the button using method reference
        myButton2.setOnAction(this::buttonClick2);
        pane.add(myButton2, 0, 3);
        pane.add(hasilLabel2, 1, 3);
        
        myButton3.setOnAction(this::buttonClick3);
        pane.add(myButton3, 0, 4);
        pane.add(hasilLabel3, 1, 4);
        
        myButton4.setOnAction(this::buttonClick4);
        
        pane.add(myButton4, 0, 5);
        pane.add(hasilLabel4, 1, 5);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 500,300);
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    private void buttonClick1(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        int hasil1 = calc.jumlah(numop1,numop2);
        hasilLabel1.setText(Integer.toString(hasil1));
    }
    private void buttonClick2(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        int hasil2 = calc.kurang(numop1,numop2);
        hasilLabel2.setText(Integer.toString(hasil2));
    }
    private void buttonClick3(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        int hasil3 = calc.kali(numop1,numop2);
        hasilLabel3.setText(Integer.toString(hasil3));
    }
    private void buttonClick4(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        int numop1 = Integer.parseInt(op1Tf.getText());
        int numop2 = Integer.parseInt(op2Tf.getText());
        float hasil4 = calc.bagi(numop1,numop2);
        hasilLabel4.setText(Float.toString(hasil4));
    }

}