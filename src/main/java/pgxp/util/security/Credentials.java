package pgxp.util.security;

import java.io.Serializable;
import java.util.Objects;

/**
 * <p>Credentials class.</p>
 *
 * @author gladson
 * @version $Id: $Id
 */
public class Credentials implements Serializable {

    private String username;
    private String password;

    /**
     * <p>Getter for the field <code>username</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>Setter for the field <code>username</code>.</p>
     *
     * @param username a {@link java.lang.String} object.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>Getter for the field <code>password</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>Setter for the field <code>password</code>.</p>
     *
     * @param password a {@link java.lang.String} object.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.username);
        return hash;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credentials other = (Credentials) obj;
        return Objects.equals(this.username, other.username);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Credentials{" + "username=" + username + ", password=" + password + '}';
    }

}
