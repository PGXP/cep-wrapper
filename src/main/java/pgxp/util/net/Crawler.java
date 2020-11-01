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
import pgxp.util.entity.Cep;
import pgxp.util.entity.Cnae;
import pgxp.util.entity.Cnpj;
import pgxp.util.entity.Cpf;
import pgxp.util.security.Token;

/**
 * <p>
 * Crawler class.</p>
 *
 * @author gladson
 * @version $Id: $Id
 */
@RequestScoped
public class Crawler {

    private static final Logger LOG = Logger.getLogger(Crawler.class.getName());

    @Inject
    private AdminConfig admin;

    @Inject
    private Login login;

    /**
     * <p>
     * getCep.</p>
     *
     * @param cep a {@link java.lang.String} object.
     * @return a {@link pgxp.util.entity.Cep} object.
     */
    public List getCep(String cep) {

        try {
            Token token = login.getToken();
            String hostSent = admin.getUrl() + "api/v1/ceps/?cep=";
            String text = hostSent + cep.trim();

            URL url = new URL(text);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "Demoiselle");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Authorization", token.getType() + " " + token.getKey());
            connection.connect();

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

            Type listType = new TypeToken<List<Cep>>() {
            }.getType();
            return (new Gson().fromJson(response.toString(), listType));

        }
        catch (MalformedURLException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * <p>
     * getCep.</p>
     *
     * @param cep a {@link java.lang.String} object.
     * @return a {@link pgxp.util.entity.Cep} object.
     */
    public List getCpf(String cpf) {

        try {
            Token token = login.getToken();
            String hostSent = admin.getUrl() + "api/v1/cpfs/?cpf=";
            String text = hostSent + cpf.trim();

            URL url = new URL(text);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "Demoiselle");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Authorization", token.getType() + " " + token.getKey());
            connection.connect();

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

            Type listType = new TypeToken<List<Cpf>>() {
            }.getType();
            return (new Gson().fromJson(response.toString(), listType));

        }
        catch (MalformedURLException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * <p>
     * getCep.</p>
     *
     * @param cep a {@link java.lang.String} object.
     * @return a {@link pgxp.util.entity.Cep} object.
     */
    public List getSocio(String cnpj) {

        try {
            Token token = login.getToken();
            String hostSent = admin.getUrl() + "api/v1/cpfs/?cnpj=";
            String text = hostSent + cnpj.trim();

            URL url = new URL(text);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "Demoiselle");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Authorization", token.getType() + " " + token.getKey());
            connection.connect();

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

            Type listType = new TypeToken<List<Cpf>>() {
            }.getType();
            return (new Gson().fromJson(response.toString(), listType));

        }
        catch (MalformedURLException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * <p>
     * getCep.</p>
     *
     * @param cnpj a {@link java.lang.String} object.
     * @return a {@link pgxp.util.entity.Cep} object.
     */
    public List getCnpj(String cnpj) {

        try {
            Token token = login.getToken();
            String hostSent = admin.getUrl() + "api/v1/cnpjs/?cnpj=";
            String text = hostSent + cnpj.trim();

            URL url = new URL(text);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "Demoiselle");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Authorization", token.getType() + " " + token.getKey());
            connection.connect();

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

            Type listType = new TypeToken<List<Cnpj>>() {
            }.getType();
            return (new Gson().fromJson(response.toString(), listType));

        }
        catch (MalformedURLException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * <p>
     * getCep.</p>
     *
     * @param cnae a {@link java.lang.String} object.
     * @return a {@link pgxp.util.entity.Cep} object.
     */
    public List getCnae(String cnae) {

        try {
            Token token = login.getToken();
            String hostSent = admin.getUrl() + "api/v1/cnaes/?subclasseId=";
            String text = hostSent + cnae.trim() + "&sort=atividade";

            URL url = new URL(text);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "Demoiselle");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Authorization", token.getType() + " " + token.getKey());
            connection.connect();

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

            Type listType = new TypeToken<List<Cnae>>() {
            }.getType();
            return (new Gson().fromJson(response.toString(), listType));

        }
        catch (MalformedURLException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
