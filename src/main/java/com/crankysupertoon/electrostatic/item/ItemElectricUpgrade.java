package com.crankysupertoon.electrostatic.item;

import com.crankysupertoon.electrostatic.item.base.ItemModSubs;

public class ItemElectricUpgrade extends ItemModSubs {

    public ItemElectricUpgrade() {
        super("electric_upgrade", 1);
    }

    @Override
    protected String getModelName(int variant) {
                return "mekanism_upgrade";
        }
    }
