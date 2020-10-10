package rz.mod.blocks.slab;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import rz.mod.Main;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class BlockHalfSlabBase extends BlockSlabBase implements IHasModel
{
	public BlockHalfSlabBase(String name, Material material, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, material, half);
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble()
	{
		return false;
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
