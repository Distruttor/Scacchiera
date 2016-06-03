
package it.unitn.disi.scacchiera.bottoni;

import it.unitn.disi.scacchiera.Main;
import static it.unitn.disi.scacchiera.Main.scac;
import it.unitn.disi.scacchiera.componenti.Cella;
import it.unitn.disi.scacchiera.componenti.MyGriglia;
import it.unitn.disi.scacchiera.componenti.PulsantiTop;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class Reset extends Button {
    public Reset()
    {
        setText("Reset");
        setOnAction(resetta);
    }
    
    
    EventHandler<ActionEvent> resetta = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent t) {

            for(int i = 0; i < Main.N * Main.N; i++)
            {
                ((Cella)((MyGriglia)scac.getChildren().get(0)).getChildren().get(i)).setFill(Color.WHITE);
                ((Cella)((MyGriglia)scac.getChildren().get(1)).getChildren().get(i)).setFill(Color.WHITE);
            }   
            PulsantiTop.cambia.setDisable(false);
        }
        
    }; 
}
