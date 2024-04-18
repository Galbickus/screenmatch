package com.aluracursos.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
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
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=the+matrix&y=1999&apikey=26dd704c"))
                .build();
        /*HttpRequest req = new HttpRequest();
        * no se puede hacer un new de HttpRequest, porque es una clase abstrac-
        * ta, por eso usamos un patron Builder*/
        /**/

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
