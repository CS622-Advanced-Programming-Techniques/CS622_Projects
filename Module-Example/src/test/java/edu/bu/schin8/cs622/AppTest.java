package edu.bu.schin8.cs622;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void trueTest()
    {
        LOGGER.debug("The test");
        assertTrue( false );
    }



   @Test
   public void true2Test()
   {
       assertTrue( true );
   }
}
