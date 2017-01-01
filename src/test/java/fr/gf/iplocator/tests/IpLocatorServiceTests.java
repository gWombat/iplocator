package fr.gf.iplocator.tests;

import fr.gf.iplocator.IpLocatorResult;
import fr.gf.iplocator.services.IpLocatorService;
import fr.gf.iplocator.services.impl.IpLocatorServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by gWombat
 *
 * @since 01/01/2017.
 */
@RunWith(SpringRunner.class)
public class IpLocatorServiceTests {

    private static final Logger logger = LoggerFactory.getLogger(IpLocatorServiceTests.class);

    private IpLocatorService locatorService;

    @Before
    public void setUp() {
        locatorService = new IpLocatorServiceImpl();
    }

    @Test
    public void testService() {
        //92.222.108.194 - Allemagne
        IpLocatorResult result = locatorService.getLocationForIp("92.222.108.194");
        Assert.assertNotNull(result);
        logger.debug(result.toString());

        //91.235.91.62 - Russie
        result = locatorService.getLocationForIp("91.235.91.62");
        Assert.assertNotNull(result);
        logger.debug(result.toString());
    }

}
