package fr.gf.iplocator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.TimeZone;

/**
 * Created by gWombat
 *
 * @since 01/01/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IpLocatorResult implements Serializable {

    private static final long serialVersionUID = -8772632025960596789L;

    private IpLocatorResultStatus status;
    private String country;
    private String countryCode;
    private String region;
    private String regionName;
    private String city;
    private String zip;

    @JsonProperty("lat")
    private float latitude;

    @JsonProperty("lon")
    private float longitude;

    @JsonProperty("timezone")
    private TimeZone timeZone;
    private String isp;

    @JsonProperty("org")
    private String organization;
    private String as;
    private String reverse;
    private boolean mobile;
    private boolean proxy;
    private String query;
    private IpLocatorFailMessage message;

    @Override
    public String toString() {
        return "IpLocatorResult{" +
                "status=" + status +
                ", country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", region='" + region + '\'' +
                ", regionName='" + regionName + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timeZone=" + timeZone +
                ", isp='" + isp + '\'' +
                ", organization='" + organization + '\'' +
                ", as='" + as + '\'' +
                ", reverse='" + reverse + '\'' +
                ", mobile=" + mobile +
                ", proxy=" + proxy +
                ", query='" + query + '\'' +
                ", message=" + message +
                '}';
    }

    public IpLocatorResultStatus getStatus() {
        return status;
    }

    public void setStatus(IpLocatorResultStatus status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public boolean isProxy() {
        return proxy;
    }

    public void setProxy(boolean proxy) {
        this.proxy = proxy;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public IpLocatorFailMessage getMessage() {
        return message;
    }

    public void setMessage(IpLocatorFailMessage message) {
        this.message = message;
    }
}
