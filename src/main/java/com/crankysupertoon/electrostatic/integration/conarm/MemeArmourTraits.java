package com.crankysupertoon.electrostatic.integration.conarm;

import c4.conarm.lib.modifiers.ArmorModifierTrait;
import c4.conarm.lib.utils.RecipeMatchHolder;
import com.crankysupertoon.electrostatic.EConfig;
import com.crankysupertoon.electrostatic.item.MemeItems;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("NullableProblems")
public class MemeArmourTraits {

    public static ArmourTraitElectromechanical ELECTROMECHANICAL;
    public static final List<ArmorModifierTrait> ARMOUR_MODS = new ArrayList<>();

    public static void init() {
        if (EConfig.enableConArmElectromechanical) {
            ARMOUR_MODS.add(ELECTROMECHANICAL = new ArmourTraitElectromechanical());
            RecipeMatchHolder.addItem(ELECTROMECHANICAL, new ItemStack(MemeItems.ELECTRIC_UPGRADE, 1, 0), 1, 1);
        }
    }

}
