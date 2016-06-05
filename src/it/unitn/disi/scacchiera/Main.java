
package it.unitn.disi.scacchiera;

import it.unitn.disi.scacchiera.componenti.PulsantiBot;
import it.unitn.disi.scacchiera.componenti.PulsantiTop;
import it.unitn.disi.scacchiera.componenti.Scacchiere;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;



public class Main extends Application {
    
    public static int N = 10;
    public static Stage finestra = null;
    public static Scene scena = null;
    public static Scacchiere scac = null;
    
    @Override
    public void start(Stage primaryStage){
        JOptionPane scelta = new JOptionPane();
        String valore  = scelta.showInputDialog("Inserisci il valore di N");
        N = Integer.parseInt(valore);
        VBox layout = new VBox();
        Scene scene = new Scene(layout,800,400);
        scena = scene;
        
        
        finestra = primaryStage;
        
        
       
        layout.setSpacing(30);
        
 
        
        
        Scacchiere scacchiere = new Scacchiere();   
        scac = scacchiere;
        
        PulsantiTop top = new PulsantiTop();
        PulsantiBot bot = new PulsantiBot();
        
        
        
        layout.getChildren().addAll(top,scacchiere,bot);
       
        
        layout.maxWidthProperty().bind(scene.widthProperty().divide(2));
        layout.minHeightProperty().bind(scene.heightProperty().divide(2));


        primaryStage.setScene(scene);
        primaryStage.setTitle("Scacchiere");               
        primaryStage.show();
    }
   
    
    public static void main(String args[])
    {
        launch(args);
    }
}
