package Clases;

import java.util.ArrayList;
import java.util.List;

public class RegistroVenta {

    private List<venta> listaVentas = new ArrayList<venta>();
    private double ventasDiarias;

    public void addVenta(venta v) {
        this.listaVentas.add(v);
    }

    public double gananciasDiarias(String dia){
        this.ventasDiarias = 0;
        for (venta vent:listaVentas){
            if (vent.getFecha() == dia) {
                this.ventasDiarias += vent.getGanancias();
            }
        }
        return(ventasDiarias);
    }
}
