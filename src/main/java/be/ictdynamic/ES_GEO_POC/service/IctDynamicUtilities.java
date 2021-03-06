package be.ictdynamic.ES_GEO_POC.service;

import org.slf4j.Logger;

/**
 * Created by admin on 21/12/2017.
 */
public class IctDynamicUtilities {
    public static <T> T timedReturn(final Logger LOGGER, final String method, final long start, final T object) {
        logTimedReturn(LOGGER, method, start);

        return object;
    }


    public static void timedReturn(final Logger LOGGER, final String method, final long start) {
        logTimedReturn(LOGGER, method, start);
    }

    private static void logTimedReturn(Logger LOGGER, String method, long start) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(String.format("Execution of method %s took %05d ms", method, System.currentTimeMillis() - start));
        }
    }
}
