package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numeroEpisodio;
    private String nombreDelEpisodio;
    private Serie serie;
    private int temporada;
    private int totalDeVisualizaciones;

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }
    /*GETTERS Y SETTERS*/
    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNombreDelEpisodio() {
        return nombreDelEpisodio;
    }

    public void setNombreDelEpisodio(String nombreDelEpisodio) {
        this.nombreDelEpisodio = nombreDelEpisodio;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getTotalDeVisualizaciones() {
        return totalDeVisualizaciones;
    }

    public void setTotalDeVisualizaciones(int totalDeVisualizaciones) {
        this.totalDeVisualizaciones = totalDeVisualizaciones;
    }

    /*sobreescritura del metodo calif segun reproducciones*/
    @Override
    public int getClasificacion() {
        if (totalDeVisualizaciones > 100){
            return 4;
        }else if (totalDeVisualizaciones > 50){
            return 2;
        }else{
            return 1;
        }
    }



}
