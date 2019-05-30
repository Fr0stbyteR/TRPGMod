package net.fr0stbyter.trpgmod.network;

import net.fr0stbyter.trpgmod.TRPGMod;
import net.fr0stbyter.trpgmod.network.message.MessageRollDice;
import net.fr0stbyter.trpgmod.network.message.MessageRollDiceHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(TRPGMod.MODID);
    public static void init() {
        INSTANCE.registerMessage(MessageRollDiceHandler.class, MessageRollDice.class, 0, Side.SERVER);
    }
}
