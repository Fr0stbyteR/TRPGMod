package net.fr0stbyter.trpgmod.util;

import net.fr0stbyter.trpgmod.item.*;
import net.minecraft.item.Item;

public class TRPGInstances {
    public static final Item D2 = new ItemD2().setRegistryName("d2").setUnlocalizedName("d2");
    public static final Item D4 = new ItemD4().setRegistryName("d4").setUnlocalizedName("d4");
    public static final Item D6 = new ItemD6().setRegistryName("d6").setUnlocalizedName("d6");
    public static final Item D8 = new ItemD8().setRegistryName("d8").setUnlocalizedName("d8");
    public static final Item D10 = new ItemD10().setRegistryName("d10").setUnlocalizedName("d10");
    public static final Item D12 = new ItemD12().setRegistryName("d12").setUnlocalizedName("d12");
    public static final Item D20 = new ItemD20().setRegistryName("d20").setUnlocalizedName("d20");
    public static final Item D100 = new ItemD100().setRegistryName("d100").setUnlocalizedName("d100");
    public static Item[] getItems() {
        return new Item[]{
                D2, D4, D6, D8, D10, D12, D20, D100
        };
    }
}
