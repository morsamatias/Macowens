package Clases;

public class prenda {

    private double precioBase;
    private estado state;
    private tipo tipoo;


    public void setEstado(estado a){
        state = a;
    }

    public double precioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public tipo getTipo(){
        return (tipoo);
    }

    public void setTipoo(tipo tipoo) {
        this.tipoo = tipoo;
    }

    public double getGanancias(){
        return this.state.precio(this.precioBase);
    }
}
