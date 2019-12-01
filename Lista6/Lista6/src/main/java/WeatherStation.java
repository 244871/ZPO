import com.google.gson.Gson;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class  WeatherStation{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwę miasta");
        String miasto = scanner.nextLine();

        StringBuffer response=new StringBuffer();
        String url="http://api.openweathermap.org/data/2.5/weather?q="+miasto+",uk&APPID=25ad6d5bf627a7b040073de1e523a669";

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
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response);

        Gson gson= new Gson();
        HttpResponse parsed = gson.fromJson(response.toString(), HttpResponse.class);

        System.out.println("Pogoda w mieście" + miasto + ":\n");
        System.out.println("temperatura: " + parsed.getMain().getTemp());
        System.out.println("ciśnienie: " + parsed.getMain().getPressure());
        System.out.println("wilgotność: " + parsed.getMain().getHumidity());
        System.out.println("minimalna: " + parsed.getMain().getTemp_min());
        System.out.println("maksymalna: " + parsed.getMain().getTemp_max());

    }
}
