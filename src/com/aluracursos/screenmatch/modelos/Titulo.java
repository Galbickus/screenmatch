package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int anioLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int cantidadDeEvaluaciones;

    public Titulo(String nombre, int anioLanzamiento) {
        this.nombre = nombre;
        this.anioLanzamiento = anioLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.anioLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la " +
                    "duración porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(
                miTituloOmdb.runtime().substring(0,3).replace(" ",""));

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }

    public void setSumaEvaluaciones(double sumaEvaluaciones) {
        this.sumaEvaluaciones = sumaEvaluaciones;
    }

    public int getCantidadDeEvaluaciones() {
        return cantidadDeEvaluaciones;
    }

    public void setCantidadDeEvaluaciones(int cantidadDeEvaluaciones) {
        this.cantidadDeEvaluaciones = cantidadDeEvaluaciones;
    }

    public void evaluar(double nota){
        sumaEvaluaciones += nota;
        cantidadDeEvaluaciones++;
        }
    public double calcularPromedio(){
        return sumaEvaluaciones / cantidadDeEvaluaciones;

    }

    public void mostrarFichaTecnica(){
        System.out.println("\n-*-*-*-*-*-*\nFicha Técnica\n-*-*-*-*-*-*\n");
        System.out.println("Título: " + nombre);
        System.out.println("Año de lanzamiento es: " + anioLanzamiento);
        System.out.println("Duración: " + getDuracionEnMinutos() + " min.");
    }

    @Override
    public int compareTo(Titulo otroTitulo) {

        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(Nombre: " + nombre + ", Lanzamiento: " + anioLanzamiento + ", duración: " + duracionEnMinutos+") ";
    }
}
