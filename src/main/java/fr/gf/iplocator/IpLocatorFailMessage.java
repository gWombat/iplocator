package fr.gf.iplocator;


import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by gWombat
 *
 * @since 01/01/2017.
 */
public enum IpLocatorFailMessage {

    PRIVATE_RANGE,
    RESERVED_RANGE,
    INVALID_QUERY,
    QUOTA;

    @JsonValue
    public String getName() {
        return this.name().toLowerCase();
    }

}
