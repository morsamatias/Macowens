package Clases;
/* esta clase es la interfaz Clases.estado, las clases Clases.nueva, Clases.promocion y  Clases.liquidacion usan esta interface*/

public interface estado{

    double precio(double precioBase);
}