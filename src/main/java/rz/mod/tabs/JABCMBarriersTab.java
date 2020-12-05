package rz.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import rz.mod.init.ModBlocks;

public class JABCMBarriersTab extends CreativeTabs
{
	public JABCMBarriersTab(String label)
	{
		super("jabcm_barrier_tab");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.jbrick_wall_special);
	}
}
