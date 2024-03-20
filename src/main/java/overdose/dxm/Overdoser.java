package overdose.dxm;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import overdose.dxm.item.ModItemGroups;
import overdose.dxm.item.ModItems;

public class Overdoser implements ModInitializer {
	public static final String MOD_ID = "overdoser";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Overdosers!");
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();

		FluidRenderHandlerRegistry.INSTANCE.register(ModItems.STILL_OIL, ModItems.FLOWING_OIL, new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xAABB55
		));

	}
}