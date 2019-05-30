package net.fr0stbyter.trpgmod.network.message;

import io.netty.buffer.ByteBuf;
import net.fr0stbyter.trpgmod.util.Dice.EnumDiceType;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class MessageRollDice implements IMessage {
    public EnumDiceType type;
    public int count;

    public MessageRollDice() {
        this.type = EnumDiceType.D6;
        this.count = 1;
    }

    public MessageRollDice(EnumDiceType typeIn) {
        this.type = typeIn;
        this.count = 1;
    }

    public MessageRollDice(int countIn) {
        this.type = EnumDiceType.D6;
        this.count = countIn;
    }

    public MessageRollDice(EnumDiceType typeIn, int countIn) {
        this.type = typeIn;
        this.count = countIn;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.type = EnumDiceType.fromRange(buf.readByte());
        this.count = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeByte(this.type.range);
        buf.writeInt(this.count);
    }
}
