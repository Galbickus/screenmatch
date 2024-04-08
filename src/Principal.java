public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.anioLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;


        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Año de lanzamiento es: " + miPelicula.anioLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.anioLanzamiento = 1999;
        otraPelicula.duracionEnMinutos = 110;

        System.out.println("Mi pelicula es: " + otraPelicula.nombre);
        System.out.println("Año de lanzamiento es: " + otraPelicula.anioLanzamiento);
        System.out.println("-*-*-*-*-*-*");
        miPelicula.mostrarFichaTecnica();
        otraPelicula.mostrarFichaTecnica();

    }
}
