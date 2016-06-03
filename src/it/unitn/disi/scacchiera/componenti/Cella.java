
package it.unitn.disi.scacchiera.componenti;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Cella extends Rectangle{
    
  
    static int num_cella = 0;
    public int numero;
    private int x;
    private int y;
    
    
    public Cella()
    {  
        
        numero = num_cella++;
        this.setWidth(30);
        this.setHeight(30);
     
        this.setFill(Color.WHITE);
        this.setStroke(Color.BLACK);         
    }
    
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
    
    
    public String toString()
    {
      String ris = new String();
      ris = "X = " + getCoordinateX() + ", Y = " + getCoordinateY();
      
      return ris;
    }
}
