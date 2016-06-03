
package it.unitn.disi.scacchiera.componenti;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class Scacchiere extends HBox{
    public Scacchiere()
    {
        MyGriglia sinistra = new MyGriglia(true);
        MyGriglia destra = new MyGriglia(false);
        
        getChildren().addAll(sinistra, destra);
        setSpacing(200);
        setAlignment(Pos.CENTER);
        setLayoutY(100);
    }
}
