package net.fr0stbyter.trpgmod.util;

import net.fr0stbyter.trpgmod.item.ItemD6;
import net.minecraft.item.Item;

public class TRPGInstances {
    public static Item D6 = new ItemD6().setRegistryName("d6").setUnlocalizedName("d6");
    public static Item[] getItems() {
        return new Item[]{
                D6
        };
    }
}
