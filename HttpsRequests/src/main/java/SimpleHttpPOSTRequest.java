import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SimpleHttpPOSTRequest {

    public static void main(String[] args) {

        String text;
        StringBuffer content = new StringBuffer();

        try {

            URL url = new URL("https://reqres.in/api/users");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");

            conn.setDoOutput(true);

            String postData = "{'email':alice@loonycorn.com," +
                    "'firstName':Alice','lastName':'Alison'}";

            try(OutputStream outputStream = conn.getOutputStream()) {
                byte[] postByte = postData.getBytes(StandardCharsets.UTF_8);
                outputStream.write(postByte, 0, postByte.length);
                outputStream.flush();
            }
            System.out.println("Response Code: " +conn.getResponseCode());
            System.out.println("Response Message: " +conn.getResponseMessage());

            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));

                StringBuilder responsetext = new StringBuilder();

                while ((text = reader.readLine()) != null) {
                    responsetext.append(text.trim());
                }

                if (conn.getHeaderField("Content-Type").contains("json")) {
                    JSONObject jsonObject = new JSONObject(responsetext.toString());
                    System.out.println("JSON:" +jsonObject.toString(3));
                }else {
                    System.out.println(responsetext.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            conn.disconnect();

        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
