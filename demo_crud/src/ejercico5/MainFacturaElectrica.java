
package ejercico5;

import java.util.Scanner;

public class MainFacturaElectrica {
    public static void main(String[] args) {
        double factura1 = 0.0;
        double factura2 = 0.0;
        
        Factura_Electrica factura = new Factura_Electrica();
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de dias a facturar :");
        factura.setConsumoMen(leer.nextDouble());
        System.out.println("Introduzca el consumo actual en kwh :");
        factura.setLecActual_kwh(leer.nextDouble());
        System.out.println("Introduzca el consumo anterior en kwh :");
        factura.setLecAnterior_kwh(leer.nextDouble());
        System.out.println("La cantidad del multiplicador es :");
        factura.setMultiplicador(leer.nextDouble());
        
        System.out.println("-------------------------------------------");
        factura1 = factura.valFactura();
        factura2 = factura.consuMens();
        System.out.println(""+factura1);
        System.out.println(""+factura2);
        
    }
}
