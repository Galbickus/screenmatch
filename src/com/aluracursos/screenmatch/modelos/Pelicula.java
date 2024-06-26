package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public Pelicula(String nombre, int anioLanzamiento) {
        super(nombre, anioLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calcularPromedio()/2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " año de estreno (" + this.getAnioLanzamiento() + ").\n";
    }
}
