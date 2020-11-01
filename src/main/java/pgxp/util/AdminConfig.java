/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgxp.util;

import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import org.demoiselle.jee.configuration.annotation.Configuration;

/**
 * <p>
 * AdminConfig class.</p>
 *
 * @author paulo
 * @version $Id: $Id
 */
@Configuration(prefix = "pgxp.util")
public class AdminConfig {

    private static final Logger LOG = getLogger(AdminConfig.class.getName());

    private String url;
    private String user;
    private String password;

    /**
     * <p>
     * Getter for the field <code>url</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * Setter for the field <code>url</code>.</p>
     *
     * @param url a {@link java.lang.String} object.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * Getter for the field <code>password</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * Setter for the field <code>password</code>.</p>
     *
     * @param password a {@link java.lang.String} object.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
