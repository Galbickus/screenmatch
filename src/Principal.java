import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

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


//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.setNombre("Matrix");
//        otraPelicula.setAnioLanzamiento(1999);
//        otraPelicula.setDuracionEnMinutos(110);

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

        System.out.println("Tiempo total de la lista de reproducción: " + calculadoraDeTiempo.getTiempoTotal());

    }
}
