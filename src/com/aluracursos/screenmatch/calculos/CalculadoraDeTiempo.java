package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    /*this se utiliza en este código para distinguir la
    variable de instancia tiempoTotal del parámetro titulo,
    y para indicar que queremos modificar
     la variable de instancia del objeto actual*/

    public void incluir(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
