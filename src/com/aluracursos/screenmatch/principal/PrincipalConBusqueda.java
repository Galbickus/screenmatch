package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*interfaz pública HttpResponse<T>
Una respuesta HTTP.
Un HttpResponseno se crea directamente, sino que se devuelve como resultado del envío de un archivo HttpRequest. Un HttpResponseestá disponible cuando se han recibido el código de estado de la respuesta y los encabezados y, normalmente, después de que el cuerpo de la respuesta también se haya recibido por completo. El hecho de HttpResponseque esté disponible o no antes de que se haya recibido por completo el cuerpo de la respuesta depende de lo BodyHandlerproporcionado al enviar el archivo HttpRequest.
Esta clase proporciona métodos para acceder al código de estado de la respuesta, los encabezados, el cuerpo de la respuesta y lo HttpRequestcorrespondiente a esta respuesta.

El siguiente es un ejemplo de cómo recuperar una respuesta como una cadena:

   HttpResponse<String> response = client
     .send(request, BodyHandlers.ofString());
La clase BodyHandlersproporciona implementaciones de muchos controladores de respuestas comunes. Alternativamente, BodyHandler se puede utilizar una implementación personalizada.*/

/*ver patron builder*/
public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);

        List<Titulo> titulos = new ArrayList<>();

        while (true){
            System.out.println("Escriba el nombre de una película");
            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") + "&apikey=26dd704c";
            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                /*HttpRequest req = new HttpRequest();
                 * no se puede hacer un new de HttpRequest, porque es una clase abstrac-
                 * ta, por eso usamos un patron Builder*/
                /**/

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();


                System.out.println(json);

                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .create();
                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Título ya convertido: " + miTitulo);

                FileWriter escritura = new FileWriter("peliculas.txt");
                escritura.write(miTitulo.toString());
                escritura.close();

            }catch(NumberFormatException e){
                System.out.println("Ocurrió un error: ");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException ie){
                System.out.println("Error en la URI, verifique la dirección.");
            }catch (ErrorEnConversionDeDuracionException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Finalizó la ejecución del programa");
    }
}
