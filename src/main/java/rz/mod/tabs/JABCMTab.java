package rz.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import rz.mod.init.ModBlocks;

public class JABCMTab extends CreativeTabs
{
	private String title = "";
	private boolean hoveringButton = false;
	
	public JABCMTab(String label)
	{
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.concrete_stairs_special);
	}
	
    @Override
    public String getTranslatedTabLabel()
    {
        return hoveringButton ? title : "itemGroup." + this.getTabLabel();
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setHoveringButton(boolean hoveringButton)
    {
        this.hoveringButton = hoveringButton;
    }
}
