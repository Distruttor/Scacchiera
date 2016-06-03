
package it.unitn.disi.scacchiera.listener;

import it.unitn.disi.scacchiera.Main;
import static it.unitn.disi.scacchiera.Main.scac;
import it.unitn.disi.scacchiera.componenti.Cella;
import it.unitn.disi.scacchiera.componenti.MyGriglia;
import it.unitn.disi.scacchiera.componenti.PulsantiTop;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Sbianca implements EventHandler<MouseEvent>{

    @Override
    public void handle(MouseEvent t) {
       Cella cella = (Cella)t.getSource();
       cella.setFill(Color.WHITE);
       
        int target = cella.getNumero() - (Main.N * Main.N);
        if(PulsantiTop.modalita.getText() == "Uguale")
        {
            
            ((Cella)((MyGriglia)scac.getChildren().get(0)).getChildren().get(target)).setFill(Color.WHITE);
        }
        else if(PulsantiTop.modalita.getText() == "Speculare")
        {   
            int primo_riga = target;
            
            while(primo_riga % Main.N != 0)
            {
                primo_riga--;
            }
            
            int ultimo_riga = primo_riga + Main.N - 1;
            int valore = primo_riga + ultimo_riga;
            
            int obbiettivo = valore - target;
            
            ((Cella)((MyGriglia)scac.getChildren().get(0)).getChildren().get(obbiettivo)).setFill(Color.WHITE);
        }
    }
    
}
