package rz.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import rz.mod.init.ModBlocks;

public class JABCMTab extends CreativeTabs
{
	public JABCMTab(String label)
	{
		super("jabcm_tab");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.concrete_stairs_special);
	}
}
