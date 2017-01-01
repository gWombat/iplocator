package fr.gf.iplocator.services;

import fr.gf.iplocator.IpLocatorResult;

/**
 * Created by gWombat
 *
 * @since 01/01/2017.
 */
public interface IpLocatorService {

    IpLocatorResult getLocationForIp(String ipAddress);
}
