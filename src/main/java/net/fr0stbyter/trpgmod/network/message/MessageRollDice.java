package net.fr0stbyter.trpgmod.network.message;

import io.netty.buffer.ByteBuf;
import net.fr0stbyter.trpgmod.util.Dice.EnumDiceType;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class MessageRollDice implements IMessage {
    public EnumDiceType type;
    public int nDice;

    public MessageRollDice() {
        this.type = EnumDiceType.D6;
        this.nDice = 1;
    }
    public MessageRollDice(EnumDiceType typeIn) {
        this.type = typeIn;
        this.nDice = 1;
    }
    public MessageRollDice(int n) {
        this.type = EnumDiceType.D6;
        this.nDice = n;
    }
    public MessageRollDice(EnumDiceType typeIn, int n) {
        this.type = typeIn;
        this.nDice = n;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.type = EnumDiceType.fromRange(buf.readByte());
        this.nDice = buf.readInt();
    }
    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeByte(this.type.range);
        buf.writeInt(this.nDice);
    }
}
