
package it.unitn.disi.scacchiera;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PopUp extends Stage{
    
    /**
     * Finestra di PopUp utilizzata per stampare 
     * su una TextArea le coordinate delle celle annerite.
     * @param lista Stringa da stampare.
     */
    public PopUp(String lista)
    {
        setTitle("Stampa");       
        TextArea testo = new TextArea();
        testo.setPrefWidth(200);
        testo.setText(lista);
        testo.setEditable(false);
        Pane pane = new Pane(testo);
        initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(pane);
        setScene(scene);
        show();
        
    }
}
