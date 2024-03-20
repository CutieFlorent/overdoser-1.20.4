package overdose.dxm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import overdose.dxm.Overdoser;

public class ModItems {
    //Items
    public static final Item DXM = Registry.register(Registries.ITEM, new Identifier(Overdoser.MOD_ID, "dxm"), new Item(new FabricItemSettings().food(ModFoodComponents.DXM)));
    public static final Item PR80 = Registry.register(Registries.ITEM, new Identifier(Overdoser.MOD_ID, "pr80"), new Item(new FabricItemSettings().food(ModFoodComponents.PR80)));
    public static final Item NIGHT = Registry.register(Registries.ITEM, new Identifier(Overdoser.MOD_ID, "night"), new Item(new FabricItemSettings().food(ModFoodComponents.NIGHT)));
    public static final Item SNS = Registry.register(Registries.ITEM, new Identifier(Overdoser.MOD_ID, "sns"), new Item(new FabricItemSettings().food(ModFoodComponents.SNS)));

    public static final FlowableFluid STILL_OIL = Registry.register(Registries.FLUID, new Identifier(Overdoser.MOD_ID, "oil"), new OilFluid.Still());
    public static final FlowableFluid FLOWING_OIL = Registry.register(Registries.FLUID, new Identifier(Overdoser.MOD_ID, "flowing_oil"), new OilFluid.Flowing());
    public static final Item OIL_BUCKET = Registry.register(Registries.ITEM, new Identifier(Overdoser.MOD_ID, "oil_bucket"), new BucketItem(STILL_OIL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    public static final Block OIL = Registry.register(Registries.BLOCK, new Identifier(Overdoser.MOD_ID, "oil"), new FluidBlock(ModItems.STILL_OIL, FabricBlockSettings.copy(Blocks.WATER)));

    //Item Creator

    public static void registerModItems(){

        Overdoser.LOGGER.info("Registering mod items for" + Overdoser.MOD_ID);
    }
}
