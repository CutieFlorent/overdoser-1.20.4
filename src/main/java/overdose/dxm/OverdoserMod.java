package overdose.dxm;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import overdose.dxm.item.ModItems;

public class OverdoserMod implements ModInitializer {
	public static final String MOD_ID = "overdosermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Overdosers!");
		ModItems.registerModItems();
	}
}