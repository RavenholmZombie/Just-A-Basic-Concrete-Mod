package rz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import rz.mod.blocks.BlockBase;
import rz.mod.blocks.slab.BlockDoubleSlabBase;
import rz.mod.blocks.slab.BlockHalfSlabBase;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Stair Blocks.
	public static Block concrete_stairs_white = new JABCMStairs("concrete_stairs_white", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_orange = new JABCMStairs("concrete_stairs_orange", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_magenta = new JABCMStairs("concrete_stairs_magenta", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_blue = new JABCMStairs("concrete_stairs_blue", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_lblue = new JABCMStairs("concrete_stairs_lblue", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_yellow = new JABCMStairs("concrete_stairs_yellow", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_lime = new JABCMStairs("concrete_stairs_lime", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_pink = new JABCMStairs("concrete_stairs_pink", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_gray = new JABCMStairs("concrete_stairs_gray", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_silver = new JABCMStairs("concrete_stairs_silver", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_cyan = new JABCMStairs("concrete_stairs_cyan", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_purple = new JABCMStairs("concrete_stairs_purple", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_brown = new JABCMStairs("concrete_stairs_brown", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_green = new JABCMStairs("concrete_stairs_green", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_red = new JABCMStairs("concrete_stairs_red", Blocks.CONCRETE.getDefaultState());
	public static Block concrete_stairs_black = new JABCMStairs("concrete_stairs_black", Blocks.CONCRETE.getDefaultState());
	
	// OMG HE FINALLY ADDED SLABS :O yay woohoo *crowd cheers as fireworks explode off in the distance and a marching band playing Hail to the Chief marches by*
	// White
	public static final BlockSlab double_slab_white = new BlockDoubleSlabBase("double_slab_white", Material.ROCK, ModBlocks.half_slab_white);
	public static final BlockSlab half_slab_white = new BlockHalfSlabBase("half_slab_white", Material.ROCK, ModBlocks.half_slab_white, ModBlocks.double_slab_white);
	// Orange
	public static final BlockSlab double_slab_orange = new BlockDoubleSlabBase("double_slab_orange", Material.ROCK, ModBlocks.half_slab_orange);
	public static final BlockSlab half_slab_orange = new BlockHalfSlabBase("half_slab_orange", Material.ROCK, ModBlocks.half_slab_orange, ModBlocks.double_slab_orange);
	// Magenta
	public static final BlockSlab double_slab_magenta = new BlockDoubleSlabBase("double_slab_magenta", Material.ROCK, ModBlocks.half_slab_magenta);
	public static final BlockSlab half_slab_magenta = new BlockHalfSlabBase("half_slab_magenta", Material.ROCK, ModBlocks.half_slab_magenta, ModBlocks.double_slab_magenta);
	
	
	// Super duper special rainbow blocks ^_^
	public static Block concrete_special = new BlockBase("concrete_special", Material.ROCK);
	public static Block concrete_stairs_special = new JABCMStairs("concrete_stairs_special", Blocks.CONCRETE.getDefaultState());
	
}
