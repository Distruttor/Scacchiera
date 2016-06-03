
package it.unitn.disi.scacchiera;

import it.unitn.disi.scacchiera.componenti.PulsantiBot;
import it.unitn.disi.scacchiera.componenti.PulsantiTop;
import it.unitn.disi.scacchiera.componenti.Scacchiere;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {
    
    public static final int N = 10;
    public static Stage finestra = null;
    public static Scene scena = null;
    public static Scacchiere scac = null;
    
    @Override
    public void start(Stage primaryStage){
        finestra = primaryStage;
        
        VBox layout = new VBox();
        layout.setLayoutY(50);
        layout.setSpacing(50);
        
 
        
        
        Scacchiere scacchiere = new Scacchiere();   
        scac = scacchiere;
        
        PulsantiTop top = new PulsantiTop();
        PulsantiBot bot = new PulsantiBot();
        
        
        
        layout.getChildren().addAll(top,scacchiere,bot);
       
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scacchiere");               
        primaryStage.show();
    }
   
    
    public static void main(String args[])
    {
        launch(args);
    }
}
