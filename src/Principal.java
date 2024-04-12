import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.*;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setAnioLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.mostrarFichaTecnica();
        miPelicula.evaluar(7.3);
        miPelicula.evaluar(0.5);
        miPelicula.evaluar(6.5);
        miPelicula.evaluar(7.3);
        miPelicula.evaluar(9.5);
        miPelicula.evaluar(6.5);
        miPelicula.evaluar(9.3);
        miPelicula.evaluar(7.5);
        miPelicula.evaluar(4.5);

        System.out.println("La suma de las evaluaciones es: " + String.format("%.2f" , miPelicula.getSumaEvaluaciones()));
        System.out.println("El promedio de notas evaluadas es: " + String.format("%.2f" , miPelicula.calcularPromedio()));
        System.out.println("Cantidad de evaluaciones contempladas: " + miPelicula.getCantidadDeEvaluaciones());


        Pelicula pelicula2 = new Pelicula();
        pelicula2.setNombre("Matrix");
        pelicula2.setAnioLanzamiento(1999);
        pelicula2.setDuracionEnMinutos(110);

//        otraPelicula.mostrarFichaTecnica();
//        otraPelicula.evaluar(9.9);
//        otraPelicula.evaluar(8.8);
//        otraPelicula.evaluar(8.3);

//        System.out.println("La suma de las evaluaciones es: " + String.format("%.2f" , otraPelicula.getSumaEvaluaciones()));
//        System.out.println("El promedio de notas evaluadas es: " + String.format("%.2f", otraPelicula.calcularPromedio()));
//        System.out.println("Cantidad de evaluaciones contempladas: " + otraPelicula.getCantidadDeEvaluaciones());

        Serie serie1 = new Serie();
        serie1.setNombre("The Big Bang theory");
        serie1.setAnioLanzamiento(2011);
        serie1.setIncluidoEnElPlan(true);

        serie1.setTemporadas(12);
        serie1.setEpisodiosPorTemporada(20);
        serie1.setMinutosPorEpisodio(22);

        System.out.println("............");
        serie1.mostrarFichaTecnica();

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluir(miPelicula);
        calculadoraDeTiempo.incluir(serie1);
        calculadoraDeTiempo.incluir(pelicula2);


        System.out.println("Tiempo total de la lista de reproducción: " + calculadoraDeTiempo.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        Episodio episodio8 = new Episodio();
        episodio8.setNumeroEpisodio(8);
        episodio8.setNombreDelEpisodio("El pony de Lisa");
        episodio8.setSerie(serie1);
        episodio8.setTotalDeVisualizaciones(1);

        filtroRecomendacion.filtrar(episodio8);

        /*A partir de Java 10, se permite usar VAR en las variables de
         referencia, por más que diga VAR EN JAVA NO SE
          PUEDE CAMBIAR DE TIPO DE variable porque JAVA es
          fuertemente tipado */

        var peliculaDeBruno = new Pelicula();
        peliculaDeBruno.setNombre("El señor de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.setAnioLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(pelicula2);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera de la lista es: " + listaDePeliculas.get(0).getNombre());
        System.out.println("La segunda película de la lista es: " + listaDePeliculas.get(1).getNombre());
        System.out.println("La lista completa es: \n" + listaDePeliculas);

    }
}
