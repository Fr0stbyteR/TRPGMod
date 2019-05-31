package net.fr0stbyter.trpgmod;

import net.fr0stbyter.trpgmod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TRPGMod.MODID, name = TRPGMod.NAME, version = TRPGMod.VERSION)
public class TRPGMod {
    public static final String MODID = "trpgmod";
    public static final String NAME = "TRPG Mod";
    public static final String VERSION = "0.0";

    private static Logger logger;

    @Mod.Instance(TRPGMod.MODID)
    public static TRPGMod instance;

    @SidedProxy(clientSide = "net.fr0stbyter.trpgmod.proxy.ClientProxy",
            serverSide = "net.fr0stbyter.trpgmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
