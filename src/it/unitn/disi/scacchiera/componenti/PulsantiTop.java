
package it.unitn.disi.scacchiera.componenti;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class PulsantiTop extends HBox {
    
    public static Button cambia = new Button("Cambia Modalità");
    public static Label modalita = new Label("Uguale");
    
    /**
     * Raggruppa in un HBox i pulsanti che andranno
     * nella parte alta della finestra.
     */
    public PulsantiTop()        
    {
        cambia.setOnAction(cambiare);
        modalita.setLabelFor(cambia);
        getChildren().addAll(cambia,modalita);
        setAlignment(Pos.CENTER);
        setSpacing(50);
    }
    
    /**
     * Evento che modifica il testo di una label.
     * Da associare a un bottone.
     */
    EventHandler<ActionEvent> cambiare = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
            if(modalita.getText() == "Uguale")
                modalita.setText("Speculare");
            else
                modalita.setText("Uguale");
        }
    };
}
