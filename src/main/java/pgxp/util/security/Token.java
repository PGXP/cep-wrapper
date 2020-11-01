package pgxp.util.security;

import java.io.Serializable;

/**
 * <p>
 * Credentials class.</p>
 *
 * @author gladson
 * @version $Id: $Id
 */
public class Token implements Serializable {

    private String type;
    private String key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
