package overdose.dxm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import overdose.dxm.Overdoser;



public class ModBlocks {



    /*public static final Block PHARMACY = Registry.register(
            Registries.BLOCK,new Identifier(Overdoser.MOD_ID, "pharmacy"),);*/




    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,
                new Identifier(Overdoser.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }




    public static void registerModBlocks(){

        Overdoser.LOGGER.info("Registering mod blocks for" + Overdoser.MOD_ID);
    }
}




