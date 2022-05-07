/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_crud3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 5-. Un trabajador de la industria de la construcción gana $10 diarios en su jornada normal de trabajo. En ciertas ocasiones 
el empleado tiene que trabajar horas extras para cumplir con su trabajo. En el mes a acumulado 50 horas extras que se la 
pagan al 10% del valor del pago diario. ¿Cuánto ganara el trabajador al final de un mes de trabajo?
 */
public class salariodeltrabajador {
    public static void main(String[] args) {
          NumberFormat formato; formato = new DecimalFormat ("#0.00");
     
        double Salariodiario, horasExtra, salarioNeto,salariomensual,salarioFinal,renta,PagoHoraExtra;
        
        Salariodiario= 10;
        horasExtra=50;
       
      
      salarioNeto = 10*30 ;
       PagoHoraExtra= horasExtra*1; 
       salariomensual = salarioNeto + PagoHoraExtra;
      renta= salariomensual*0.10;
      salarioFinal= salariomensual - renta;
      
      System.out.println("El trabajador ganara : $" + formato.format(salarioFinal)+ " " + "al final del mes");
        
       
     }


}
