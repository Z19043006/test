package whq.smartplm.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class WistronApiUtil {
    @Value("${plm.server.url}")
    private String plmServer;
    @Value("${plm.username}")
    private String plmUsername;
    @Value("${plm.password}")
    private String plmPassword;

    private Logger logger;

    public Map<String,Object> sendGetRequest(String apiName, Map<String,String> paramMap) {
        HashMap<String, Object> result = new HashMap<>();

        try {
            String parameters = "";
            for (String key : paramMap.keySet()) {
                parameters += key + "=" + paramMap.get(key) + "&";
            }
            parameters = parameters.substring(0,parameters.lastIndexOf("&"));
            URL url = new URL(plmServer + apiName + "?" + parameters);
            //logger.info(url.toString());
            String sslFile = WistronApiUtil.class.getClassLoader().getResource("jssecacerts").getPath();
            System.setProperty("javax.net.ssl.trustStore", sslFile);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            String encoded = Base64.getEncoder().encodeToString((plmUsername + ":" + plmPassword).getBytes(StandardCharsets.UTF_8));
            con.setRequestProperty("Authorization", "Basic " + encoded);
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");
            if (con.getResponseCode() != 200) {
                throw new RuntimeException("HTTP GET Request Failed with Error code : " + con.getResponseCode());
            }
            InputStreamReader io = new InputStreamReader(con.getInputStream());
            BufferedReader responseBuffer = new BufferedReader(io);
            String output;
            while ((output = responseBuffer.readLine()) != null) {
                result = new ObjectMapper().readValue(output, HashMap.class);
            }
            con.disconnect();
            return result;

        } catch (Exception e) {
            logger.error(e.getMessage());
            return result;
        }
    }
}





