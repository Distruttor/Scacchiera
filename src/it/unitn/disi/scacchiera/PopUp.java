
package it.unitn.disi.scacchiera;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PopUp extends Stage{
    public PopUp(String lista)
    {
        setTitle("Stampa");
        
        TextArea testo = new TextArea();
        testo.setText(lista);
        testo.setEditable(false);
        Pane pane = new Pane(testo);
        initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(pane, 400, 400);
        setScene(scene);
        show();
        
    }
}
