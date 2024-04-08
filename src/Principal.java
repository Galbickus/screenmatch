public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.anioLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.anioLanzamiento = 1999;
        otraPelicula.duracionEnMinutos = 110;

        miPelicula.mostrarFichaTecnica();
        miPelicula.evaluar(7.3);
        miPelicula.evaluar(0.5);
        miPelicula.evaluar(6.5);
        miPelicula.evaluar(7.3);
        miPelicula.evaluar(9.5);
        miPelicula.evaluar(6.5);

        System.out.println("La suma de las evaluaciones es: " + String.format("%.2f" ,miPelicula.sumaEvaluaciones));
        System.out.println("El promedio de notas evaluadas es: " + String.format("%.2f" , miPelicula.calcularPromedio()));
        System.out.println("Cantidad de evaluaciones contempladas: " + miPelicula.cantidadDeEvaluaciones);

        otraPelicula.mostrarFichaTecnica();
        otraPelicula.evaluar(9.9);
        otraPelicula.evaluar(8.8);
        otraPelicula.evaluar(8.3);

        System.out.println("La suma de las evaluaciones es: " + String.format("%.2f" , otraPelicula.sumaEvaluaciones));
        System.out.println("El promedio de notas evaluadas es: " + String.format("%.2f", otraPelicula.calcularPromedio()));
        System.out.println("Cantidad de evaluaciones contempladas: " + otraPelicula.cantidadDeEvaluaciones);
    }
}
