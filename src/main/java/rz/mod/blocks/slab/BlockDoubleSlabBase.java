package rz.mod.blocks.slab;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockDoubleSlabBase extends BlockSlabBase
{
	public BlockDoubleSlabBase(String name, Material material, BlockSlab half)
	{
		super(name, material, half);	
	}
	
	@Override
	public boolean isDouble()
	{
		return true;
	}
	
}
