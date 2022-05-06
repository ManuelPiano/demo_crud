
package Demo_crud;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calculoIVA {
    public static void main(String[] args) {
        ejercicio2 cal = new ejercicio2();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner (System.in);
        double precioA, valorI;
        valorI=0.13;
        try{
            // Ingreso de datos
        System.out.println("Ingrese el precio del producto: ");//Agreagar el precio del producto.
        precioA = Double.parseDouble(leer.readLine());
       
        // Metodo set
        cal.setPorcentIva(valorI);
        cal.setPrecioArticuloconIva(precioA);
        cal.setValorIva();
        cal.setPrecioArticuloSinIva();
        
        // Entrega de datos (Precio del producto sin aplicar IVA)
        System.out.println("-----------------------------------------");
        System.out.println("El precio del producto es el siguiente \n");
        System.out.println("El precio del producto sin IVA incluido es: $" + cal.getPrecioArticuloSinIva());
        System.out.println("El precio del producto con IVA includo es: $" + cal.getPrecioArticuloconIva());
        System.out.println("El valor del IVA que incluye el producto es de: " + cal.getValorIva());
        System.out.println("El porcentaje de iva a aplicar es: " + cal.getPorcentIva() + "%");
        System.out.println("-------------------------------------------");
        
    }catch (Exception e){
            System.out.println(e.getMessage());
    }
     
    }
    
    
}
