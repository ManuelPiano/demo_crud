
package semana1guia1;

/**
 *
 * @author hogar
 */
public class calcularvalordemoneda {
    public static void main(String[] args) {
        double monedaEuropa, monedaReinoUnido, monedaAustralia, monedaCanada,dolares;
        monedaEuropa = 0.70;
        monedaReinoUnido = 0.61;
        monedaAustralia = 0.95;
        monedaCanada = 0.97;
        dolares = 100.00;
        
        monedaEuropa = monedaEuropa * dolares;
        monedaReinoUnido = monedaReinoUnido * dolares;
        monedaAustralia = monedaAustralia * dolares;
        monedaCanada = monedaCanada * dolares;
        
        System.out.println("Conversion de $100 a Moneda de Europa: " + monedaEuropa);
        System.out.println("Conversion de $100 a Moneda de Reino Unido: " + monedaReinoUnido);
        System.out.println("Conversion de $100 a Moneda de Australia: " + monedaAustralia);
        System.out.println("Conversion de $100 a Moneda de Canada: " + monedaCanada);
        
        
    }
}

    

