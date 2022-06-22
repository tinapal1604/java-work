import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleHttpRequests {

    public static void main(String[] args) {

        BufferedReader reader;
        String text;
        StringBuffer content = new StringBuffer();

        try{

            URL url = new URL("https://reqres.in/api/users?page=2&delay=5");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int statusCode = conn.getResponseCode();

            System.out.println("The status is: "+statusCode);
           // System.out.println("Returned headers: \n" +conn.getHeaderFields());
            System.out.println("Content size: " +conn.getHeaderField("Content-length"));
            System.out.println("Content type: " +conn.getHeaderField("Content-Type"));

            System.out.println("The response body:");
            if (statusCode >= 200 && statusCode <= 299) {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                while ((text = reader.readLine()) != null) {
                    content.append(text);
                }
                reader.close();

                String responseText = content.toString();

                if (conn.getHeaderField("Content-type").contains("json")) {
                    JSONObject jsonObject = new JSONObject(responseText);
                    System.out.println("JSON:\n" +jsonObject.toString(4));
                }else {
                    System.out.println(responseText);
                }
            }else {
                System.out.println("The request failed.");
            }
            conn.disconnect();
        }catch (MalformedURLException murle) {
            murle.printStackTrace();
        }catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
