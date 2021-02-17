package rz.mod.blocks.slab;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rz.mod.init.ModBlocks;
import rz.mod.util.ColorList;

public class BlockDoubleSlabBase extends BlockSlabBase
{

	public BlockDoubleSlabBase(String name, Material material, BlockSlab half, Enum color)
	{
		super(name, material, half);
		setHardness(1.8F);
		setResistance(1.8F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
		
	}
	
	@Override
	public boolean isDouble()
	{
		return true;
	}
	
	// Below this comment are some of the stupidest fixes I've ever come up with, but the MDK has forced my hand.
	// Do not read this code if you value your sanity.
	// I am so deeply sorry for this mess, but it had to be done. Forgive me.
	// I feel dirty for writing this code, like I need to go take a shower.
	
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		// White
		if(this.getUnlocalizedName().contains("white") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_white);
		}
		else if(this.getUnlocalizedName().contains("white") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_white);
		}
		
		// Orange
		if(this.getUnlocalizedName().contains("orange") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_orange);
		}
		else if(this.getUnlocalizedName().contains("orange") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_orange);
		}
		
		// Magenta
		if(this.getUnlocalizedName().contains("magenta") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_magenta);
		}
		else if(this.getUnlocalizedName().contains("magenta") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_magenta);
		}
		
		// Light Blue
		if(this.getUnlocalizedName().contains("lblue") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_lblue);
		}
		else if(this.getUnlocalizedName().contains("lblue") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_lblue);
		}
		
		// Yellow
		if(this.getUnlocalizedName().contains("yellow") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_yellow);
		}
		else if(this.getUnlocalizedName().contains("yellow") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_yellow);
		}
		
		// Lime
		if(this.getUnlocalizedName().contains("lime") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_lime);
		}
		else if(this.getUnlocalizedName().contains("lime") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_lime);
		}
		
		// Pink
		if(this.getUnlocalizedName().contains("pink") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_pink);
		}
		else if(this.getUnlocalizedName().contains("pink") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_pink);
		}
		
		// Gray
		if(this.getUnlocalizedName().contains("gray") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_gray);
		}
		else if(this.getUnlocalizedName().contains("gray") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_gray);
		}
		
		// Silver
		if(this.getUnlocalizedName().contains("silver") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_silver);
		}
		else if(this.getUnlocalizedName().contains("silver") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_silver);
		}
		
		// Cyan
		if(this.getUnlocalizedName().contains("cyan") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_cyan);
		}
		else if(this.getUnlocalizedName().contains("cyan") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_cyan);
		}
		
		// Purple
		if(this.getUnlocalizedName().contains("purple") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_purple);
		}
		else if(this.getUnlocalizedName().contains("purple") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_purple);
		}
		
		// Blue
		if(this.getUnlocalizedName().contains("blue") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_blue);
		}
		else if(this.getUnlocalizedName().contains("blue") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_blue);
		}
		
		// Brown
		if(this.getUnlocalizedName().contains("brown") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_brown);
		}
		else if(this.getUnlocalizedName().contains("brown") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_brown);
		}
		
		// Green
		if(this.getUnlocalizedName().contains("green") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_green);
		}
		else if(this.getUnlocalizedName().contains("green") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_green);
		}
		
		// Red
		if(this.getUnlocalizedName().contains("red") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_red);
		}
		else if(this.getUnlocalizedName().contains("red") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_red);
		}
		
		// Black
		if(this.getUnlocalizedName().contains("black") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_black);
		}
		else if(this.getUnlocalizedName().contains("black") && this.getUnlocalizedName().contains("jbrick"))
		{
			return new ItemStack(ModBlocks.half_slab_jbrick_black);
		}
		
		return new ItemStack(Blocks.STONE);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		// White
		if(this.getUnlocalizedName().contains("white") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_white);
		}
		else if(this.getUnlocalizedName().contains("white") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_white);
		}
		else if(this.getUnlocalizedName().contains("orange") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_orange);
		}
		else if(this.getUnlocalizedName().contains("orange") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_orange);
		}
		else if(this.getUnlocalizedName().contains("magenta") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_magenta);
		}
		else if(this.getUnlocalizedName().contains("magenta") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_magenta);
		}
		else if(this.getUnlocalizedName().contains("lblue") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_lblue);
		}
		else if(this.getUnlocalizedName().contains("lblue") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_lblue);
		}
		else if(this.getUnlocalizedName().contains("lime") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_lime);
		}
		else if(this.getUnlocalizedName().contains("lime") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_lime);
		}
		else if(this.getUnlocalizedName().contains("yellow") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_yellow);
		}
		else if(this.getUnlocalizedName().contains("yellow") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_yellow);
		}
		else if(this.getUnlocalizedName().contains("pink") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_pink);
		}
		else if(this.getUnlocalizedName().contains("pink") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_pink);
		}
		else if(this.getUnlocalizedName().contains("gray") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_gray);
		}
		else if(this.getUnlocalizedName().contains("gray") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_gray);
		}
		else if(this.getUnlocalizedName().contains("silver") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_silver);
		}
		else if(this.getUnlocalizedName().contains("silver") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_silver);
		}
		else if(this.getUnlocalizedName().contains("cyan") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_cyan);
		}
		else if(this.getUnlocalizedName().contains("cyan") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_cyan);
		}
		else if(this.getUnlocalizedName().contains("purple") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_purple);
		}
		else if(this.getUnlocalizedName().contains("purple") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_purple);
		}
		else if(this.getUnlocalizedName().contains("blue") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_blue);
		}
		else if(this.getUnlocalizedName().contains("blue") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_blue);
		}
		else if(this.getUnlocalizedName().contains("brown") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_brown);
		}
		else if(this.getUnlocalizedName().contains("brown") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_brown);
		}
		else if(this.getUnlocalizedName().contains("green") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_green);
		}
		else if(this.getUnlocalizedName().contains("green") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_green);
		}
		else if(this.getUnlocalizedName().contains("red") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_red);
		}
		else if(this.getUnlocalizedName().contains("red") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_red);
		}
		else if(this.getUnlocalizedName().contains("black") && !this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_black);
		}
		else if(this.getUnlocalizedName().contains("black") && this.getUnlocalizedName().contains("jbrick"))
		{
			return Item.getItemFromBlock(ModBlocks.half_slab_jbrick_black);
		}
		
		return Item.getItemFromBlock(Blocks.STONE);
	}
	
	@Override
    public int quantityDropped(Random random)
    {
        return 2;
    }
	
	@Override
    protected boolean canSilkHarvest()
    {
        return false;
    }
}
