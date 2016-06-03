
package it.unitn.disi.scacchiera.componenti;

import it.unitn.disi.scacchiera.Main;
import it.unitn.disi.scacchiera.listener.Annerisci;
import it.unitn.disi.scacchiera.listener.Sbianca;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;

public class MyGriglia extends TilePane{
    
    boolean sinistra;
    
    public MyGriglia(boolean sinistra)
    {
        
       
//        setPrefWidth(50);
        this.sinistra = sinistra;
        setPrefColumns(Main.N);
        setPrefRows(Main.N);
     
        for(int i = 0; i < Main.N * Main.N; i++)
        {
            Cella cella = new Cella();
            int x = i % Main.N + 1;
            int y = i / Main.N + 1;
            cella.setCoordinate(x, y);
            
            if(sinistra == true)
            {
                cella.addEventHandler(MouseEvent.MOUSE_CLICKED, new Annerisci());
            }
            else
            {
                cella.addEventHandler(MouseEvent.MOUSE_CLICKED, new Sbianca());
            }  
            
                getChildren().add(cella);
        }
        
        
    }
    
    public String toString()
    {
      String ris = new String();
      if(sinistra)
          ris = "Griglia di Sinistra";
      else
          ris = "Griglia di Destra";
      
      return ris;
    }
}
