package net.fr0stbyter.trpgmod.util.Dice;

public enum EnumDiceType {
    D2(2),
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    public final byte range;

    EnumDiceType(int rangeIn) {
        this.range = (byte) rangeIn;
    }

    public static EnumDiceType fromRange(byte rangeIn) {
        for (EnumDiceType type : EnumDiceType.values()) {
            if (type.range == rangeIn) return type;
        }
        return D6;
    }
}
