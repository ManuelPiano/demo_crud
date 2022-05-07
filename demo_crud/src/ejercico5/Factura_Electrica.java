/*
 2-. Crear la clase Factura Eléctrica utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos: (No Cuenta, Lectura actual del medidor, Lectura anterior del medidor, Multiplicador, Consumo Mensual, Consumo 
Diario, Valor Factura)
Métodos:
a) Crear un método para calcular el Consumo en el mes
b) Crear un método para calcular el Consumo Diario
c) Crear un método para calcular el Valor Factura
d) Imprimir Todos los Atributos
Ejemplo del cálculo:
Lectura Anterior: 2010 Lectura Actual: 3025
Multiplicador: 10 Días de facturación: 30
Consumo: (lectura actual - lectura anterior) x el multiplicador
Consumo = (3025kWh 2010kWh) * 10 = 10150kWh
Valor factura = Consumo * 0.20
e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
 */
package ejercico5;


public class Factura_Electrica {
    double noCuenta;
    double lecActual_kwh;
    double lecAnterior_kwh;
    double multiplicador;
    double consumoMen;
    double consumoDia;
    double valorFactura;

    public Factura_Electrica() {
    }

    public Factura_Electrica(double noCuenta, double lecActual_kwh, double lecAnterior_kwh, double multiplicador, double consumoMen, double consumoDia, double valorFactura) {
        this.noCuenta = noCuenta;
        this.lecActual_kwh = lecActual_kwh;
        this.lecAnterior_kwh = lecAnterior_kwh;
        this.multiplicador = multiplicador;
        this.consumoMen = consumoMen;
        this.consumoDia = consumoDia;
        this.valorFactura = valorFactura;
    }

    public double getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(double noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getLecActual_kwh() {
        return lecActual_kwh;
    }

    public void setLecActual_kwh(double lecActual_kwh) {
        this.lecActual_kwh = lecActual_kwh;
    }

    public double getLecAnterior_kwh() {
        return lecAnterior_kwh;
    }

    public void setLecAnterior_kwh(double lecAnterior_kwh) {
        this.lecAnterior_kwh = lecAnterior_kwh;
    }


    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getConsumoMen() {
        return consumoMen;
    }

    public void setConsumoMen(double consumoMen) {
        this.consumoMen = consumoMen;
    }

    public double getConsumoDia() {
        return consumoDia;
    }

    public void setConsumoDia(double consumoDia) {
        this.consumoDia = consumoDia;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    
    public double valFactura(){
        double consumo = (this.lecActual_kwh - this.lecAnterior_kwh)*this.multiplicador;
        double valorFactura = consumo * 0.20;
        return valorFactura;
    }
    
     public double consuMens(){
        double consumo = (this.lecActual_kwh - this.lecAnterior_kwh)* this.multiplicador;
        double valorDeFactura = consumo * 0.20;
        double consumoMen = valorDeFactura * this.consumoMen;
        return consumoMen;
    }
}
