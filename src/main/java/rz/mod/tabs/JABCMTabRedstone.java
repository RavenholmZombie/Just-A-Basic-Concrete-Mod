package rz.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import rz.mod.init.ModBlocks;

public class JABCMTabRedstone extends CreativeTabs
{
	public JABCMTabRedstone(String label)
	{
		super("jabcm_tab_rs");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.special_plate);
	}
}
