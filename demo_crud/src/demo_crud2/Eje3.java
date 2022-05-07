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
public class Eje3 {
     public static void main(String[] args) {
        
    
        sumar();
        int z = sumar1();
        System.out.println("");
        
        System.out.println("el valor de z es: " + z);
        System.out.println("");
        
        System.out.println("" + sumar1(10,15));
        System.out.println("");
        
        restar();
        multiplicar();
        Salario();
        Informacion();
    
    }

    private static void sumar() {
        int a,b,resultado;
        a = 10;
        b = 15;
        resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }
    
        private static int sumar1() {
        int a,b,resultado;
        a = 10;
        b = 15;
        resultado = a + b;
        return resultado;
    }
        
        private static int sumar1(int x, int y) {
        int suma;
        suma = x + y;
        return suma;
    }  
        


    private static void restar() {
        
    }

    private static void multiplicar() {
       
    }

    private static void Salario() {
        
    }

    private static void Informacion() {
        
    }
}
