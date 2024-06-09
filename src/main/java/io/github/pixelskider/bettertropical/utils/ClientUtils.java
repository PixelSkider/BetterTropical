package io.github.pixelskider.bettertropical.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Kalud
 * @website pixelskider.github.io/
 * @since 2024/06/01
 */
public class ClientUtils {
    static Logger logger= LogManager.getLogger("BetterTropical");

    public static void info(String str){
        logger.info(str);
    }

}
