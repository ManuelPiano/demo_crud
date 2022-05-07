

package demo_crud;

import java.util.Scanner;


public class datoCasa {
    
    public static void main(String[] args) {
        ejercicio1 dato = new ejercicio1();
         Scanner leer = new Scanner(System.in);
         
        System.out.println("Escriba el numero de la casa");
        int numeroCasa= Integer.parseInt(leer.nextLine());
         
        System.out.println("El numero de la casa es :" + numeroCasa);
        
        dato.setNumeroPasaje(2);
        System.out.println("El numero del pasaje es: " + dato.getNumeroPasaje());
        
        dato.setNombreCalle("Calle el salamo ");
        System.out.println("El nombre de la calle es: " + dato.getNombreCalle());
    }
}
