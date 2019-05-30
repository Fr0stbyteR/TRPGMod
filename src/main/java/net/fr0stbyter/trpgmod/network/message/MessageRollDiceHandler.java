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
        int numberDice = message.nDice;
        System.out.println("message.nDice in Handler = " + message.nDice);
        int sum = 0;
        int rolled;
        String rolledText = "";
        for(int i = 0; i < numberDice; i++){
            rolled = (int) (Math.floor(Math.random() * diceType.range) + 1);
            sum += rolled;
            if(i == numberDice - 1){
                rolledText += rolled;
            }else{
                rolledText += rolled + " + ";
            }
        }
        if(numberDice != 1){
            rolledText += " = " + sum;
        }
        EntityPlayerMP player = ctx.getServerHandler().player;
        String playerName = player.getName();
        String text = playerName + " rolled " + numberDice + diceType.name() + ": " + rolledText;
        ctx.getServerHandler().player.sendMessage(new TextComponentString(text));
        return null;
    }
}
