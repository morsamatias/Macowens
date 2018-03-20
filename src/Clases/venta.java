package Clases;

import java.util.ArrayList;
import java.util.List;

public class venta {
    private String fecha;
    private double ganancias;
    private tipoDePago tp;
    private int cuotas;
    private List<item> listaItems = new ArrayList<item>();

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void agregarItem(item it){
        this.listaItems.add(it);
    }

    public String getFecha(){ return this.fecha;}

    public List<item> devolverLista(){
        return (listaItems);
    }

    public double getGanancias() {
        this.ganancias = 0;
        for (item it : listaItems) this.ganancias += it.getGanancias();
        return (tp.montoFinal(this.ganancias,cuotas));
    }

}
