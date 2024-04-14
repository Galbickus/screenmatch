package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        Pelicula pelicula2 = new Pelicula("Matrix", 1999);
        Serie serie1 = new Serie("The BigBang Theory", 2011);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        Pelicula pelicula1 = new Pelicula("Avatar", 2023);
        Serie serie2 = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(pelicula2);
        lista.add(peliculaDeBruno);
        lista.add(pelicula1);
        lista.add(serie1);
        lista.add(serie2);

        for (Titulo item: lista) {
            System.out.println(item);
        }



    }
}
