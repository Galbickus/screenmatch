import com.aluracursos.screenmatch.modelos.Pelicula;

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
    }
}
