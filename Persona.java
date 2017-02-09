
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombrePersona;
    private boolean hombre;
    private int pesoKilos;
    private int alturaCm;
    private int edad;
    private int caloriasIngeridas;
    

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombrePersona , boolean hombre, int pesoKilos , int alturaCm , int edad)
    {
        this.nombrePersona= nombrePersona;
        this.hombre = hombre;
        this.pesoKilos = pesoKilos;
        this.alturaCm = alturaCm;
        this.edad = edad;
        caloriasIngeridas = -1;
        
        
    }
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
       
    }
    public int comer(Comida comidaADar){
        int caloriasAIngerir = 0;
        caloriasAIngerir = comidaADar.getCalorias();
        caloriasIngeridas = caloriasIngeridas + caloriasAIngerir;
        
        
        
        
        return caloriasAIngerir;
        
    }
}
