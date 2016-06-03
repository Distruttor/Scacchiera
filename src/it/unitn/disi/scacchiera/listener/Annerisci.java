
package it.unitn.disi.scacchiera.listener;

import it.unitn.disi.scacchiera.Main;
import static it.unitn.disi.scacchiera.Main.scac;
import it.unitn.disi.scacchiera.componenti.Cella;
import it.unitn.disi.scacchiera.componenti.MyGriglia;
import it.unitn.disi.scacchiera.componenti.PulsantiTop;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Annerisci implements EventHandler<MouseEvent>{

    @Override
    public void handle(MouseEvent t) {
        Cella cella = (Cella)t.getSource();
        
        cella.setFill(Color.BLACK);
        
        PulsantiTop.cambia.setDisable(true);
        
        if(PulsantiTop.modalita.getText() == "Uguale")
        {
            int target = cella.getNumero();
            ((Cella)((MyGriglia)scac.getChildren().get(1)).getChildren().get(target)).setFill(Color.BLACK);
        }
        else if(PulsantiTop.modalita.getText() == "Speculare")
        {
            int target = cella.getNumero();
            int primo_riga = target;
            
            while(primo_riga % Main.N != 0)
            {
                primo_riga--;
            }
            
            int ultimo_riga = primo_riga + Main.N - 1;
            int valore = primo_riga + ultimo_riga;
            
            int obbiettivo = valore - target;
            
            ((Cella)((MyGriglia)scac.getChildren().get(1)).getChildren().get(obbiettivo)).setFill(Color.BLACK);
        }
            
        
    }
    
}
