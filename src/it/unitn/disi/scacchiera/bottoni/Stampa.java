
package it.unitn.disi.scacchiera.bottoni;

import it.unitn.disi.scacchiera.Main;
import static it.unitn.disi.scacchiera.Main.scac;
import it.unitn.disi.scacchiera.PopUp;
import it.unitn.disi.scacchiera.componenti.Cella;
import it.unitn.disi.scacchiera.componenti.MyGriglia;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class Stampa extends Button {
    /**
     * Bottone per stampa.
     */
    public Stampa()
    {
        setText("STAMPA");
        setOnAction(stampare);
    }
       
    /**
     * Evento per stampare su finestra separata
     * le coordinate delle celle annerite
     * appartenenti alla scacchiera di 
     * sinistra.
     */
    EventHandler<ActionEvent> stampare = new EventHandler<ActionEvent>() {
        String testo = new String();
        
        
        @Override
        public void handle(ActionEvent event) {
            for(int i = 0; i < Main.N * Main.N; i++)
            { 
                if(((Cella)((MyGriglia)scac.getChildren().get(0)).getChildren().get(i)).getFill() == Color.BLACK)
                    testo += ((Cella)((MyGriglia)scac.getChildren().get(0)).
                        getChildren().get(i)).toString() + "\n";
            }
            
            new PopUp(testo);
            testo = "";
        }
    };
           
    
}
