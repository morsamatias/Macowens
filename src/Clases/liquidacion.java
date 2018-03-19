package Clases;

public class liquidacion implements estado {

    @Override
    public double precio(double precioBase) {
        return (precioBase/2);
    }
}
