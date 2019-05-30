package net.fr0stbyter.trpgmod.network.message;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageRollDiceHandler implements IMessageHandler<MessageRollDice, IMessage> {
    @Override
    public IMessage onMessage(MessageRollDice message, MessageContext ctx) {
        int rolled = (int) (Math.floor(Math.random() * message.type.range) + 1);
        System.out.println(rolled);
        return null;
    }
}
