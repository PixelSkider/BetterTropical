package io.github.pixelskider.bettertropical;

import io.github.pixelskider.bettertropical.item.ModItems;
import io.github.pixelskider.bettertropical.utils.ClientUtils;
import net.fabricmc.api.ModInitializer;

/**
 * @author Kalud
 * @website pixelskider.github.io/
 * @since 2024/06/08
 */
public class BetterTropical implements ModInitializer {
    /**
     * Runs the mod initializer.
     */

    public static final String MOD_ID = "bettertropical";

    @Override
    public void onInitialize() {
        ClientUtils.info("BetterTropical init...");
        ModItems.registers();
        ClientUtils.info("BetterTropical init done!");
    }
}