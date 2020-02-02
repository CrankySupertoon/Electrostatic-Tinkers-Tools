package com.crankysupertoon.electrostatic;

import com.crankysupertoon.electrostatic.integration.IntegrationManager;
import com.crankysupertoon.electrostatic.item.MemeItems;
import com.crankysupertoon.electrostatic.trait.MemeTraits;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Electrostatic.MOD_ID, name = Electrostatic.NAME, version = Electrostatic.VERSION, useMetadata = true)
public class Electrostatic {

    public static final String MOD_ID = "electrostatic";
    public static final String NAME = "Electrostatic Tinkers Toys";
    public static final String VERSION = "1.0.1";
    public static final String MOD_PREF = MOD_ID + ":";

    @SuppressWarnings("NullableProblems")
    @Mod.Instance(MOD_ID)
    public static Electrostatic INSTANCE;

    @SuppressWarnings("NullableProblems")
    @SidedProxy(
            clientSide = "com.crankysupertoon.electrostatic.client.ClientProxy",
            serverSide = "com.crankysupertoon.electrostatic.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.registerEventHandlers();
        MemeItems.init();
        IntegrationManager.preInit();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MemeTraits.init();
        IntegrationManager.postInit();
        proxy.registerBookData();
    }

}
