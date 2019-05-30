package net.fr0stbyter.trpgmod.network.message;

import net.fr0stbyter.trpgmod.util.Dice.EnumDiceType;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageRollDiceHandler implements IMessageHandler<MessageRollDice, IMessage> {
    @Override
    public IMessage onMessage(MessageRollDice message, MessageContext ctx) {
        EnumDiceType diceType = message.type;
        int rolled = (int) (Math.floor(Math.random() * diceType.range) + 1);
        EntityPlayerMP player = ctx.getServerHandler().player;
        String playerName = player.getName();
        String text = playerName + " rolled 1" + diceType.name() + ": " + rolled;
        ctx.getServerHandler().player.sendMessage(new TextComponentString(text));
        return null;
    }
}
