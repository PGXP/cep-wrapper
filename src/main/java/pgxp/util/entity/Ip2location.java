
package pgxp.util.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.logging.Logger;

/**
 * <p>Ip2location class.</p>
 *
 * @author 70744416353
 * @version $Id: $Id
 */
public class Ip2location implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private BigInteger ipFrom;
    private BigInteger ipTo;
    private String countryCode;
    private String countryName;
    private String regionName;
    private String cityName;
    private Double latitude;
    private Double longitude;
    private String zipCode;
    private String timeZone;
    private String ip;

    /**
     * <p>Constructor for Ip2location.</p>
     */
    public Ip2location() {
    }

    /**
     * <p>Constructor for Ip2location.</p>
     *
     * @param id a {@link java.lang.Long} object.
     */
    public Ip2location(Long id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.lang.Long} object.
     */
    public Long getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.lang.Long} object.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>ipFrom</code>.</p>
     *
     * @return a {@link java.math.BigInteger} object.
     */
    public BigInteger getIpFrom() {
        return ipFrom;
    }

    /**
     * <p>Setter for the field <code>ipFrom</code>.</p>
     *
     * @param ipFrom a {@link java.math.BigInteger} object.
     */
    public void setIpFrom(BigInteger ipFrom) {
        this.ipFrom = ipFrom;
    }

    /**
     * <p>Getter for the field <code>ipTo</code>.</p>
     *
     * @return a {@link java.math.BigInteger} object.
     */
    public BigInteger getIpTo() {
        return ipTo;
    }

    /**
     * <p>Setter for the field <code>ipTo</code>.</p>
     *
     * @param ipTo a {@link java.math.BigInteger} object.
     */
    public void setIpTo(BigInteger ipTo) {
        this.ipTo = ipTo;
    }

    /**
     * <p>Getter for the field <code>countryCode</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>Setter for the field <code>countryCode</code>.</p>
     *
     * @param countryCode a {@link java.lang.String} object.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>Getter for the field <code>countryName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * <p>Setter for the field <code>countryName</code>.</p>
     *
     * @param countryName a {@link java.lang.String} object.
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * <p>Getter for the field <code>regionName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>Setter for the field <code>regionName</code>.</p>
     *
     * @param regionName a {@link java.lang.String} object.
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>Getter for the field <code>cityName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * <p>Setter for the field <code>cityName</code>.</p>
     *
     * @param cityName a {@link java.lang.String} object.
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * <p>Getter for the field <code>latitude</code>.</p>
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * <p>Setter for the field <code>latitude</code>.</p>
     *
     * @param latitude a {@link java.lang.Double} object.
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>Getter for the field <code>longitude</code>.</p>
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * <p>Setter for the field <code>longitude</code>.</p>
     *
     * @param longitude a {@link java.lang.Double} object.
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>Getter for the field <code>zipCode</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * <p>Setter for the field <code>zipCode</code>.</p>
     *
     * @param zipCode a {@link java.lang.String} object.
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>Getter for the field <code>timeZone</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * <p>Setter for the field <code>timeZone</code>.</p>
     *
     * @param timeZone a {@link java.lang.String} object.
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>Getter for the field <code>ip</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getIp() {
        return ip;
    }

    /**
     * <p>Setter for the field <code>ip</code>.</p>
     *
     * @param ip a {@link java.lang.String} object.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ip2location)) {
            return false;
        }
        Ip2location other = (Ip2location) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "org.demoiselle.geo.entity.Ip2location[ id=" + id + " ]";
    }
    private static final Logger LOG = Logger.getLogger(Ip2location.class.getName());

}
