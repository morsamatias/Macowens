package Clases;

import java.util.ArrayList;
import java.util.List;

public class item {
    private int cantidad;
    private double ganancias;
    private List<prenda> listaPrendas = new ArrayList<prenda>();

    public List<prenda> getListaPrendas() {
        return listaPrendas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void addListaPrendas(prenda a) {
        this.listaPrendas.add(a) ;
    }

    public double getGanancias(){
        this.ganancias = 0;
        for (prenda p : listaPrendas) this.ganancias += p.getGanancias();
        return (ganancias);
    }
}
