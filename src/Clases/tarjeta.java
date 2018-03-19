package Clases;

public class tarjeta implements tipoDePago {

    private double coeficiente;

    public tarjeta(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    @Override
    public double montoFinal(double monto,double cuotas) {
        return (monto + 0.01 * this.coeficiente * cuotas);
    }
}
