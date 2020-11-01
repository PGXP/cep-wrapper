package pgxp.util.net;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.net.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.net.ssl.HttpsURLConnection;
import pgxp.util.AdminConfig;
import pgxp.util.entity.Cnae;
import pgxp.util.entity.Cnpj;
import pgxp.util.security.Credentials;
import pgxp.util.security.Token;

/**
 * <p>
 * Crawler class.</p>
 *
 * @author gladson
 * @version $Id: $Id
 */
@RequestScoped
public class Login {

    private static final Logger LOG = Logger.getLogger(Login.class.getName());

    @Inject
    private AdminConfig admin;

    /**
     * <p>
     * getCep.</p>
     *
     * @return a {@link pgxp.util.entity.Cep} object.
     */
    public Token getToken() {

        try {
            Credentials cred = new Credentials();
            cred.setUsername(admin.getUser());
            cred.setPassword(admin.getPassword());
            String jsonBodyStr = new Gson().toJson(cred);
            String hostSent = admin.getUrl() + "api/auth";
            URL url = new URL(hostSent);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "Demoiselle");
            connection.setRequestProperty("charset", "utf-8");
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.connect();

            try (OutputStream outputStream = connection.getOutputStream()) {
                outputStream.write(jsonBodyStr.getBytes());
                outputStream.flush();
            }

            StringBuilder response = new StringBuilder();

            if (connection.getResponseCode() == 200) {

                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()))) {
                    String inputLine;

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                }
            }

            connection.disconnect();

            return (new Gson().fromJson(response.toString(), Token.class));

        }
        catch (MalformedURLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
