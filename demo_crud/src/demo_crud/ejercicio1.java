
package Demo_crud;
/**
 1-. Modelar una clase Casa con los atributos número de casa, numero de pasaje y nombre de la calle. El número de la
casa debe ser alfanumérico para contemplar las casas que tengan números como “27A”). Cuando la casa se crea se asigna
tanto el número de la casa, el número de pasaje y la calle. La clase tiene que tener definido un método para imprimir los valores
asignados.
 */
public class ejercicio1 {
     int numeroCasa;
    int numeroPasaje;
    String nombreCalle;

    public ejercicio1(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    ejercicio1() {
        
    }
    
    public void setNumeroCasa(int numeroCasa){
        this.numeroCasa=numeroCasa;
    }
    public int getNumeroCasa(){
      
        return numeroCasa;
    }
    public void setNumeroPasaje(int numeroPasaje){
        this.numeroPasaje=numeroPasaje;
    }
    public int getNumeroPasaje(){
        return numeroPasaje;
    }
    public void setNombreCalle(String nombreCalle){
        this.nombreCalle=nombreCalle;
    }
    public String getNombreCalle(){
        return nombreCalle;
    }

    void numeroCasa(int parseInt) {
    }

}
