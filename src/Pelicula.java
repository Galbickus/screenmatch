public class Pelicula {
    String nombre;
    int anioLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaEvaluaciones;
    int cantidadDeEvaluaciones;

    void mostrarFichaTecnica(){
        System.out.println("\n-*-*-*-*-*-*\nFicha Técnica\n-*-*-*-*-*-*\n");
        System.out.println("Título: " + this.nombre);
        System.out.println("Año de lanzamiento es: " + this.anioLanzamiento);
        System.out.println("Duración: " + this.duracionEnMinutos + " min.");
    }

    void evaluar(double nota){
        sumaEvaluaciones += nota;
        cantidadDeEvaluaciones++;
    }

    double calcularPromedio(){
        return sumaEvaluaciones / cantidadDeEvaluaciones;
    }
}
