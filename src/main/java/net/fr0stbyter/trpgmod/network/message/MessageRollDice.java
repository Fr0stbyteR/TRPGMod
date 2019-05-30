package net.fr0stbyter.trpgmod.network.message;

import io.netty.buffer.ByteBuf;
import net.fr0stbyter.trpgmod.util.Dice.EnumDiceType;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class MessageRollDice implements IMessage {
    public EnumDiceType type;
    public MessageRollDice() {
        this.type = EnumDiceType.D6;
    }
    public MessageRollDice(EnumDiceType typeIn) {
        this.type = typeIn;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.type = EnumDiceType.fromRange(buf.readByte());
    }
    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeByte(this.type.range);
    }
}
