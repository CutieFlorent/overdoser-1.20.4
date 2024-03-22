package overdose.dxm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import overdose.dxm.Overdoser;

public class ModItemGroups {
    public static final ItemGroup DRUG_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Overdoser.MOD_ID, "dxm"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroups.drugs"))
                    .icon(()->new ItemStack(ModItems.DXM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DXM);
                        entries.add(ModItems.PR80);
                        entries.add(ModItems.NIGHT);
                        entries.add(ModItems.SNS);
                        entries.add(ModItems.ClNO2);
                        entries.add(ModItems.BRON);

                        entries.add(ModItems.WEED);

                        entries.add(ModItems.OIL_BUCKET);

                    }).build());
    public static void registerModItemGroups(){
        Overdoser.LOGGER.info("Registering item groups for" + Overdoser.MOD_ID);
    }
}
