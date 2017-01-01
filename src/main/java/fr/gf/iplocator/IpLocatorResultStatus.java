package fr.gf.iplocator;


import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by gWombat
 *
 * @since 01/01/2017.
 */
public enum IpLocatorResultStatus {
    SUCCESS,
    FAIL;

    @JsonValue
    public String getName() {
        return this.name().toLowerCase();
    }
}
