package io.github.pixelskider.bettertropical.item;

import io.github.pixelskider.bettertropical.BetterTropical;
import io.github.pixelskider.bettertropical.item.items.Cooked_Tropical;
import io.github.pixelskider.bettertropical.item.items.Scorched_Tropical;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * @author Kalud
 * @website pixelskider.github.io/
 * @since 2024/06/01
 */
public class ModItems {
    static Item cooked_Tropical = null;
    static Item scorched_Tropical = null;

    public static void registers(){
        ItemGroup MoreFoodGroup = FabricItemGroupBuilder.build(new Identifier(BetterTropical.MOD_ID, "bettertropical"),() -> new ItemStack(ModItems.cooked_Tropical));

        FabricItemSettings CT_Setting = new FabricItemSettings().maxCount(64).group(MoreFoodGroup).food((new FoodComponent.Builder().hunger(5)).meat().saturationModifier(7.5f).build());
        FabricItemSettings ST_Setting = new FabricItemSettings().maxCount(64).group(MoreFoodGroup).food((new FoodComponent.Builder().hunger(2)).meat().saturationModifier(2.5f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 15 * 20, 0), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 10 * 20, 0), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 3 * 20, 0), 0.7F).build());

        cooked_Tropical = registerItem("cooked_tropical",new Cooked_Tropical(CT_Setting));
        scorched_Tropical = registerItem("scorched_tropical",new Scorched_Tropical(ST_Setting));
    }

    public static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(BetterTropical.MOD_ID,name),item);
    }
}
