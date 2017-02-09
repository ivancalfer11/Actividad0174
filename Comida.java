
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    
    private int cantidadCalorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida , int cantidadCalorias)
    {
        this.nombreComida = nombreComida;
        this.cantidadCalorias = cantidadCalorias;
      
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getCalorias()
    {
        return cantidadCalorias;
        
    }
}
