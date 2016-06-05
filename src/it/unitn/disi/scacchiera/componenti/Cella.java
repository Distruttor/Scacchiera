
package it.unitn.disi.scacchiera.componenti;

import it.unitn.disi.scacchiera.Main;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Cella extends Rectangle{
    
  
    static int num_cella = 0;
    public int numero;
    private int x;
    private int y;
    
    /**
     * Crea una cella della griglia.
     */
    public Cella()
    {    
        numero = num_cella++;
        this.setWidth(25);
        this.setHeight(25);
     
        this.setFill(Color.WHITE);
        this.setStroke(Color.BLACK); 

        this.widthProperty().bind(Main.scena.widthProperty().divide(10));
        this.heightProperty().bind(Main.scena.heightProperty().divide(10));
    }
    
    /**
     * Restituisce il numero identificativo della cella.
     * @return numero identificativo della cella.
     */
    public int getNumero()
    {
        return numero;
    }
    
    
    public void setCoordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getCoordinateX()
    {
        return this.x;
    }
    
    public int getCoordinateY()
    {
        return this.y;
    }
    
    
    /**
     * Stampa le coordinate della cella relative alla griglia.
     * @return Stringa con coodinate della cella.
     */
    public String toString()
    {
      String ris = new String();
      ris = "X = " + getCoordinateX() + ", Y = " + getCoordinateY();
      
      return ris;
    }
}
