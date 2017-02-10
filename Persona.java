
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona{
	private String nombre;
  private boolean esHombre;
  private int peso;
	private int estatura;
  private int edad;
  private int caloriasIngeridas;
  private int metabasal;
  
  public Persona(String nombre, boolean esHombre, int peso, int estatura, int edad)
  {
  	this.nombre = nombre;
    this.esHombre = esHombre;
    this.peso = peso;
    this.estatura = estatura;
		this.edad = edad;  
    caloriasIngeridas = 0;
    if(esHombre){
      metabasal= (10*peso)+(6*estatura)+(5*edad)+5;}
  	else{
      metabasal= (10*peso)+(6*estatura)+(5*edad)-161;
    }
  }
  
  public int comer(Comida comida){
  	int calorias = -1;
    if(caloriasIngeridas <= metabasal){
      calorias = comida.getCalorias();
      caloriasIngeridas += calorias;
    }    
    return calorias;
  }
  
  public int getCaloriasIngeridas(){
    return caloriasIngeridas;
  }
    public String contestar(String pregunta){
        String respuesta = " ";
        if(caloriasIngeridas <= metabasal){
            if(pregunta.length() % 3 == 0){
                respuesta += "SI";               
            }
            else {
                respuesta += "NO";
            }            
        }
        if(caloriasIngeridas > metabasal || pregunta.contains(nombre)){
            respuesta = pregunta.toUpperCase();
        }
        System.out.println(respuesta);
        return respuesta;
    }
    
}
