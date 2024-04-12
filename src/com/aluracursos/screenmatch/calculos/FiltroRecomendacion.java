package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtrar(Clasificacion clasificacion){
        if (clasificacion.getClasificacion()>=4){
            System.out.println("En auge \uD83D\uDE80");
            System.out.println("En auge 🚀");
        }else if (clasificacion.getClasificacion()>=2){
            System.out.println("Muy vista ⚡");
            System.out.println("Muy vista \\u26A1");
            System.out.println(" ");
        }else{
            System.out.println("Clasicos  \\uD83D\\uDC41");
        }
    }
}
