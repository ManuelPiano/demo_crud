
package semana1guia1;

/**
 *
 * @author hogar
 */
public class salalriodedocente {
  public static void main(String[] args) {
         double Preciohora, Horasmes,salarioNeto,salario, renta,Procesorenta;
         
         Preciohora= 8;
         Horasmes=36;
         renta= 0.10;
         
         salarioNeto= Preciohora * Horasmes ;
          Procesorenta= salarioNeto * renta;
          salario= salarioNeto- Procesorenta;
                  
         System.out.println("El salario del profesor es de :" + salario);
         
     }
  
    
}
