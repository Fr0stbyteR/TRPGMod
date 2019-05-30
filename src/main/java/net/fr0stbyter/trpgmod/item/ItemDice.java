package net.fr0stbyter.trpgmod.item;

import net.fr0stbyter.trpgmod.creativetab.TRPGCreativeTabs;
import net.fr0stbyter.trpgmod.network.NetworkHandler;
import net.fr0stbyter.trpgmod.network.message.MessageRollDice;
import net.fr0stbyter.trpgmod.util.Dice.EnumDiceType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class ItemDice extends Item {
    protected EnumDiceType diceType;

    public ItemDice() {
        setCreativeTab(TRPGCreativeTabs.TRPG);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return Integer.MAX_VALUE;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {
        if (!worldIn.isRemote) NetworkHandler.INSTANCE.sendToServer(new MessageRollDice(this.diceType));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.setActiveHand(handIn);
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
