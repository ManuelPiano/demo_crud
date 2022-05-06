/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_crud2;

/**
 *
 * @author Marihuano
 */
public class Eje2 {
     public static void main(String[] args) {
        double cantidadPrestada, tiempo, tasaDeIntereses;
        cantidadPrestada = 1500.00;
        tiempo = 0.75;
        tasaDeIntereses = 0.08;
        
        double valorInteresSimple = calcularInteresSimple (cantidadPrestada, tiempo, tasaDeIntereses);
        System.out.println("El interes es: $" + valorInteresSimple);
    }

    private static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeIntereses) {
    double interesSimple;
    interesSimple = cantidadPrestada * tiempo * tasaDeIntereses;
    return interesSimple;
    }
}
