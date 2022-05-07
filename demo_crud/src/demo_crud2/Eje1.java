package demo_crud2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Eje1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    NumberFormat num = new DecimalFormat("$#,###.##");
        
        double ValorUSA=5000, Depreciacion=0.10, Flete=700, Seguro=100;
        
        System.out.println("Valor del vehículo en USA: $");
        ValorUSA = scan.nextDouble();
        System.out.println("Depreciación: $");
        Depreciacion = scan.nextDouble();
        System.out.println("Valor del flete: $");
        Flete = scan.nextDouble();
        System.out.println("Valor del Seguro: $");
        Seguro = scan.nextDouble();
        
        double ValorDAI = obtenerDai(ValorUSA, Depreciacion, Flete, Seguro);
        
        System.out.println("Valor del DAI: " + num.format(ValorDAI));
    }
    
    public static double obtenerDai(double ValorUSA, double Depreciacion, double Flete, double Seguro){
        double DAI = 0;
        DAI = (ValorUSA - Depreciacion - Flete - Seguro) * 0.10;
        return DAI;
    }
    
}
    