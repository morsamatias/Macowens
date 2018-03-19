package Clases;

public class promocion implements estado {

    private double descuento;

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double precio(double precioBase) {
        if (precioBase > this.descuento) {
            return (precioBase - this.descuento);
        } else return (0);
    }
}
