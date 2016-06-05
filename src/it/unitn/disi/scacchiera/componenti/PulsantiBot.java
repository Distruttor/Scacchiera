
package it.unitn.disi.scacchiera.componenti;

import it.unitn.disi.scacchiera.bottoni.Reset;
import it.unitn.disi.scacchiera.bottoni.Stampa;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class PulsantiBot extends HBox {
    /**
     * Raggruppa in un HBox i pulsanti che andranno
     * nella parte bassa della finestra.
     */
    public PulsantiBot()
    {
        getChildren().addAll(new Reset(),new Stampa());
        setSpacing(100);
        setAlignment(Pos.CENTER);
        setLayoutY(5000);
                
    }
}
