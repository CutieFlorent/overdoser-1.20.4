package overdose.dxm.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DXM = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f) //右美沙芬
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS,400),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,400),1.0f).build();
    public static final FoodComponent PR80 = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f) //普瑞巴林
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,400),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,400),1.0f).build();
    public static final FoodComponent NIGHT = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f) //金刚烷胺
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,400),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,400),1.0f).build();
    public static final FoodComponent SNS = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f) //思诺思
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,400),1.0f).build();
    public static final FoodComponent ClNO2 = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f) //氯硝西泮
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,400),1.0f).build();
    public static final FoodComponent BRON = new FoodComponent.Builder().hunger(1).saturationModifier(0.25f) //白兔BRON
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,400),1.0f).build();
}
