
package semana1guia1;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class pagoenconseptodeafp {
    
public static void main(String[] args) {
    NumberFormat formato; formato = new DecimalFormat ("#0.00");
        double AFPtrabajador,AFPempleador,salario,AFPtra,AFPemp ;
        AFPtrabajador=0.06;
        AFPempleador=0.065;
        salario=500;
        
        AFPtra= salario * AFPtrabajador;
        AFPemp= salario * AFPempleador;
        
         System.out.println("el trabajador paga en concepto de trabajador en la AFP  :" + formato.format(AFPtra) );
         System.out.println("el trabajador paga en concepto de empleador en la AFP  :" + formato.format(AFPemp) );
        
    }

 
    }

    

