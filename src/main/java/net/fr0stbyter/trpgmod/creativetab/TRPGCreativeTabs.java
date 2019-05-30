package net.fr0stbyter.trpgmod.creativetab;

import net.fr0stbyter.trpgmod.util.TRPGInstances;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class TRPGCreativeTabs {
    public static final CreativeTabs TRPG = new CreativeTabs("trpg") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(TRPGInstances.D6);
        }
    };
}
