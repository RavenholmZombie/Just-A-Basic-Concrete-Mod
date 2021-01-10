package rz.mod.blocks.slab;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rz.mod.Main;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class BlockHalfSlabBase extends BlockSlabBase implements IHasModel
{
	public BlockHalfSlabBase(String name, Material material, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, material, half);
		setHardness(1.8F);
		setResistance(1.8F);
		setSoundType(SoundType.STONE);
		setCreativeTab(Main.JABCMTAB);
		setHarvestLevel("pickaxe", 0);
		
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble()
	{
		return false;
	}
	
	@Override
    public int quantityDropped(Random random)
    {
        return this.isDouble() ? 2 : 1;
    }
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
