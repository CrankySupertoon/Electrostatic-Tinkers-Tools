package com.crankysupertoon.electrostatic.integration.conarm;

import c4.conarm.lib.armor.ArmorCore;
import com.crankysupertoon.electrostatic.ElectricToolRegistry;
import com.crankysupertoon.electrostatic.integration.MemeIntegration;

public class MemeIntegrationConArm implements MemeIntegration {

    @Override
    public void preInit() {
        ElectricToolRegistry.registerPredicate(s -> s.getItem() instanceof ArmorCore);
    }

    @Override
    public void postInit() {
        MemeArmourTraits.init();
    }

}
