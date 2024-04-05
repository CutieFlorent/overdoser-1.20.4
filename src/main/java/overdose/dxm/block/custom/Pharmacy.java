package overdose.dxm.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import overdose.dxm.Overdoser;

public class Pharmacy extends Block {
    public Pharmacy(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.createExplosion(player, player.capeX,player.capeY,player.capeZ,256.0f, World.ExplosionSourceType.MOB);
        Overdoser.LOGGER.info(String.format("position: %f %f %f",player.capeX,player.capeY,player.capeZ));
        return ActionResult.SUCCESS;
    }
}
