import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestHttpRequest {
    public static void main(String[] args){
        StringBuffer response=new StringBuffer();
        String url="twój osobisty kod http";

        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("Response: " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        }catch (MalformedURLException ex){
            System.out.println("bad url");
        }catch (IIOException ex){
            System.out.println("Connection failed");
        }
        System.out.println(response);
    }
}
