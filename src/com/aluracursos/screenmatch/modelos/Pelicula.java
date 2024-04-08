package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int anioLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int cantidadDeEvaluaciones;

    public Pelicula() {
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

    public int getDuracionEnMinutos(int i) {
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

    public void mostrarFichaTecnica(){
        System.out.println("\n-*-*-*-*-*-*\nFicha Técnica\n-*-*-*-*-*-*\n");
        System.out.println("Título: " + this.nombre);
        System.out.println("Año de lanzamiento es: " + this.anioLanzamiento);
        System.out.println("Duración: " + this.duracionEnMinutos + " min.");
    }

    public void evaluar(double nota){
        sumaEvaluaciones += nota;
        cantidadDeEvaluaciones++;
    }

    double calcularPromedio(){
        return sumaEvaluaciones / cantidadDeEvaluaciones;
    }
}
