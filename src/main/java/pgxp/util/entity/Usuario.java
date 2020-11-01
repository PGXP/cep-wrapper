package pgxp.util.entity;

import java.io.Serializable;
import java.util.UUID;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 * <p>Usuario class.</p>
 *
 * @author PauloGladson
 * @version $Id: $Id
 */
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = getLogger(Usuario.class.getName());

    private UUID id;
    private String email;
    private String nome;
    private String senha;
    private String perfil;
    private String foto;

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.util.UUID} object.
     */
    public UUID getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.util.UUID} object.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>email</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>Setter for the field <code>email</code>.</p>
     *
     * @param email a {@link java.lang.String} object.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>Getter for the field <code>nome</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNome() {
        return nome;
    }

    /**
     * <p>Setter for the field <code>nome</code>.</p>
     *
     * @param nome a {@link java.lang.String} object.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * <p>Getter for the field <code>senha</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * <p>Setter for the field <code>senha</code>.</p>
     *
     * @param senha a {@link java.lang.String} object.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * <p>Getter for the field <code>perfil</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * <p>Setter for the field <code>perfil</code>.</p>
     *
     * @param perfil a {@link java.lang.String} object.
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    /**
     * <p>Getter for the field <code>foto</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFoto() {
        return foto;
    }

    /**
     * <p>Setter for the field <code>foto</code>.</p>
     *
     * @param foto a {@link java.lang.String} object.
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

}
