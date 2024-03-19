package overdose.dxm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import overdose.dxm.OverdoserMod;

public class ModItems {

    //Items (Drugs)
    //public static final Item DXM = registerItem("dxm");
    //public static final Item PR80 = registerItem("pr80");


    //Item Creator
    private static Item registerItem(String name, RegistryKey<net.minecraft.item.ItemGroup> type){
        // Create Item
        Item CUSTOM_ITEM = Registry.register(Registries.ITEM,
                new Identifier(OverdoserMod.MOD_ID, name),
                new Item(new FabricItemSettings()));
        // Put in Group
        ItemGroupEvents.modifyEntriesEvent(type)
                .register(content -> content.add(CUSTOM_ITEM));
        // Just keep now
        return CUSTOM_ITEM;
    }

    //Register All Items
    public static void registerModItems(){
        registerItem("dxm",ItemGroups.FOOD_AND_DRINK);
        registerItem("pr80",ItemGroups.FOOD_AND_DRINK);
        registerItem("night",ItemGroups.FOOD_AND_DRINK);
        OverdoserMod.LOGGER.info("Registering mod items for" + OverdoserMod.MOD_ID);
    }
}
