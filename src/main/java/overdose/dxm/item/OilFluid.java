/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package overdose.dxm.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.*;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;


public abstract class OilFluid extends ModFluid {
    @Override
    public Fluid getStill() {
        return ModItems.STILL_OIL;
    }

    @Override
    public Fluid getFlowing() {
        return ModItems.FLOWING_OIL;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.OIL_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModItems.OIL.getDefaultState().with(FluidBlock.LEVEL, WaterFluid.getBlockStateLevel(state));
    }
    public static class Flowing extends OilFluid{

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);

        }
    }
    public static class Still extends OilFluid{

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

    }
}

