import java.io.IOException;
import java.net.*;

class Test
{
    public static void main(String[] args) throws IOException, InterruptedException 
    {
        final String USERS_ENDPOINT = "https://api.radar.io/v1/users";
        final String GEOFENCES_ENDPOINT = "https://api.radar.io/v1/geofences";
        final String EVENTS_ENDPOINT = "https://api.radar.io/v1/events";
        final String TEST_SECRET_KEY = "prj_test_sk_a6a5b26c2ebab809f5d0789d42b5bae913982def";
        final String TEST_PUBLISHABLE_KEY = "prj_test_pk_0ae22efb1fa81ae4af6c3e91bd2f151931689ff8";

        URL url = new URL(GEOFENCES_ENDPOINT)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        /*
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://webcode.me")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        */
    }
}