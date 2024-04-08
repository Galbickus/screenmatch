public class Pelicula {
    String nombre;
    int anioLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    void mostrarFichaTecnica(){
        System.out.println("Ficha Técnica");
        System.out.println("Título: " + this.nombre);
        System.out.println("Año de lanzamiento es: " + this.anioLanzamiento);
        System.out.println("Duración: " + this.duracionEnMinutos + " min.");
    }
}
