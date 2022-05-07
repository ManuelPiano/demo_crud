
package Demo_crud;

/**
3-. Modelar una clase Estudiante que nos permita almacenar los datos de 5 estudiantes. Los datos que nos interesan
son el número de carnet, el nombre y el código de la carrera. Se debe de utilizar la clase HashTable para almacenar los
datos de los estudiantes. La clase deberá de permitir almacenar los cinco estudiantes y almacenarlos en la clase
Estudiante por medio de su constructor. Cuando los datos sean almacenados por medio del constructor, la clase deberá de
tener un método para imprimir los datos de cada uno de los estudiantes.
 */
public class ejercicio3 {
  int carnet;
  String nombre;
   int codigoCarrera;
   int numero;

    public ejercicio3(int numero) {
        this.numero = numero;
    }
String registro;

    @Override
    public String toString() {
        return "{" + "carnet=" + carnet + ", nombre=" + nombre + ", codigoCarrera=" + codigoCarrera + ", registro=" + registro + '}';
    }

    public ejercicio3(int carnet, String nombre, int codigoCarrera) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.codigoCarrera = codigoCarrera;
    }

    ejercicio3() {
        
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

}
