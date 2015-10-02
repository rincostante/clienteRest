package ar.gob.ambiente.servicios.clienterest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Client client = Client.create();

            WebResource webResource = client.resource("http://demoruta.cent.gov.ar/wsMedioAmbiente_v0_1/obtenerEmpresa?cuit=30702891929&token=1b1f999f6968a06c5a4196736a2c8f30");

            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }

            String output = response.getEntity(String.class);
            Empresa emp = response.getEntity(Empresa.class);
            
            System.out.println("Output from Server .... \n");
            System.out.println(output);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
