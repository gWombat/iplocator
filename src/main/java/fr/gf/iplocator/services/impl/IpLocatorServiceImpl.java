package fr.gf.iplocator.services.impl;

import fr.gf.iplocator.IpLocatorResult;
import fr.gf.iplocator.services.IpLocatorService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gWombat
 *
 * @since 01/01/2017.
 */
@Service
public class IpLocatorServiceImpl implements IpLocatorService {

    private static final String SERVICE_BASE_URL        = "http://ip-api.com/json/";
    private static final String RESULT_FIELDS_REQUESTED = "?fields=country,countryCode,region,regionName,city,zip,lat,lon,timezone,isp,org,as,reverse,mobile,proxy,query,status,message";

    public IpLocatorResult getLocationForIp(String ipAddress) {

        final String finalUrl = SERVICE_BASE_URL + ipAddress + RESULT_FIELDS_REQUESTED;

        RestTemplate restTemplate = new RestTemplate();
        IpLocatorResult result = restTemplate.getForObject(finalUrl, IpLocatorResult.class);

        return result;

    }
}
