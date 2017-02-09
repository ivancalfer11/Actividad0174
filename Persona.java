
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
    private int metabolismoBasal;

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
        caloriasIngeridas = 0;
        if (hombre = true){
            metabolismoBasal = (10*pesoKilos)+(6*alturaCm)-(5*edad)+5;
        }
        if(hombre = false){
            metabolismoBasal = (10*pesoKilos)+(6*alturaCm)-(5*edad)-161; 
        }           
             
    }
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
       
    }
    public int getMetabolismoBasal(){
        return metabolismoBasal;
    }
    public int comer(Comida comidaADar){
        int comer = -1;
        int caloriasAIngerir = comidaADar.getCalorias();       
            if(caloriasAIngerir <= metabolismoBasal){
               comer = caloriasAIngerir;
               caloriasIngeridas = caloriasIngeridas + caloriasAIngerir;
            
            }
            else{
                caloriasAIngerir = -1;
                System.out.println("no quiero comer más, gracias!!");
            }
           return comer;       
    }
    public String contestar(String pregunta){
        String respuesta = " ";
        if(caloriasIngeridas <= metabolismoBasal){
            if(pregunta.length() % 3 == 0){
                respuesta = respuesta + "Si";
            }
            else {
                respuesta = respuesta + "No";
            }            
        }
        if(caloriasIngeridas > metabolismoBasal || pregunta.contains(nombrePersona)){
            respuesta = pregunta.toUpperCase();
        }
        System.out.println(respuesta);
        return respuesta;
    }
    
}
