package com.crankysupertoon.electrostatic.trait;

import com.crankysupertoon.electrostatic.EConfig;
import com.crankysupertoon.electrostatic.item.MemeItems;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings("NullableProblems")
public class MemeTraits {

    public static TraitElectromechanical ELECTRIC;
    public static final List<ModifierTrait> MEME_MODIFIERS = new ArrayList<>();

    public static void init() {
        if (EConfig.enableElectromechanical) {
            MEME_MODIFIERS.add(ELECTRIC = new TraitElectromechanical());
            ELECTRIC.addItem(new ItemStack(MemeItems.ELECTRIC_UPGRADE, 1, 0), 1, 1);
        }
    }

    public static Stream<ModifierTrait> stream() {
        return MEME_MODIFIERS.stream();
    }

}
