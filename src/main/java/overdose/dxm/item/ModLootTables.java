package overdose.dxm.item;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import overdose.dxm.Overdoser;

public class ModLootTables {
    private static final Identifier TALL_GRASS_ID = Blocks.TALL_GRASS.getLootTableId();
    private static final Identifier SHORT_GRASS_ID = Blocks.SHORT_GRASS.getLootTableId();

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, table, source) -> {
            if(TALL_GRASS_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.WEED));
                table.pool(poolBuilder.build());
            }
            if(SHORT_GRASS_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.WEED));
                table.pool(poolBuilder.build());
            }
        });
    }

}
