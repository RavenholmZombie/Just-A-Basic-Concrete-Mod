package rz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate.Sensitivity;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import rz.mod.blocks.BlockBase;
import rz.mod.blocks.JABCMFence;
import rz.mod.blocks.JABCMPlate;
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
	
	// OMG WE FINALLY ADDED SLABS :O yay woohoo *crowd cheers as fireworks explode off in the distance and a marching band playing Hail to the Chief marches by*
	// Rainbow Slab
	public static final BlockSlab double_slab_special = new BlockDoubleSlabBase("double_slab_special", Material.ROCK, ModBlocks.half_slab_special);
	public static final BlockSlab half_slab_special = new BlockHalfSlabBase("half_slab_special", Material.ROCK, ModBlocks.half_slab_special, ModBlocks.double_slab_special);
	
	// White
	public static final BlockSlab double_slab_white = new BlockDoubleSlabBase("double_slab_white", Material.ROCK, ModBlocks.half_slab_white);
	public static final BlockSlab half_slab_white = new BlockHalfSlabBase("half_slab_white", Material.ROCK, ModBlocks.half_slab_white, ModBlocks.double_slab_white);
	// Orange
	public static final BlockSlab double_slab_orange = new BlockDoubleSlabBase("double_slab_orange", Material.ROCK, ModBlocks.half_slab_orange);
	public static final BlockSlab half_slab_orange = new BlockHalfSlabBase("half_slab_orange", Material.ROCK, ModBlocks.half_slab_orange, ModBlocks.double_slab_orange);
	// Magenta
	public static final BlockSlab double_slab_magenta = new BlockDoubleSlabBase("double_slab_magenta", Material.ROCK, ModBlocks.half_slab_magenta);
	public static final BlockSlab half_slab_magenta = new BlockHalfSlabBase("half_slab_magenta", Material.ROCK, ModBlocks.half_slab_magenta, ModBlocks.double_slab_magenta);
	// Blue
	public static final BlockSlab double_slab_blue = new BlockDoubleSlabBase("double_slab_blue", Material.ROCK, ModBlocks.half_slab_blue);
	public static final BlockSlab half_slab_blue = new BlockHalfSlabBase("half_slab_blue", Material.ROCK, ModBlocks.half_slab_blue, ModBlocks.double_slab_blue);
	// Light Blue
	public static final BlockSlab double_slab_lblue = new BlockDoubleSlabBase("double_slab_lblue", Material.ROCK, ModBlocks.half_slab_lblue);
	public static final BlockSlab half_slab_lblue = new BlockHalfSlabBase("half_slab_lblue", Material.ROCK, ModBlocks.half_slab_lblue, ModBlocks.double_slab_lblue);
	// Yellow
	public static final BlockSlab double_slab_yellow = new BlockDoubleSlabBase("double_slab_yellow", Material.ROCK, ModBlocks.half_slab_yellow);
	public static final BlockSlab half_slab_yellow = new BlockHalfSlabBase("half_slab_yellow", Material.ROCK, ModBlocks.half_slab_yellow, ModBlocks.double_slab_yellow);
	// Coca-Cola with Lime
	public static final BlockSlab double_slab_lime = new BlockDoubleSlabBase("double_slab_lime", Material.ROCK, ModBlocks.half_slab_lime);
	public static final BlockSlab half_slab_lime = new BlockHalfSlabBase("half_slab_lime", Material.ROCK, ModBlocks.half_slab_lime, ModBlocks.double_slab_lime);
	// Pink
	public static final BlockSlab double_slab_pink = new BlockDoubleSlabBase("double_slab_pink", Material.ROCK, ModBlocks.half_slab_pink);
	public static final BlockSlab half_slab_pink = new BlockHalfSlabBase("half_slab_pink", Material.ROCK, ModBlocks.half_slab_pink, ModBlocks.double_slab_pink);
	// Gray
	public static final BlockSlab double_slab_gray = new BlockDoubleSlabBase("double_slab_gray", Material.ROCK, ModBlocks.half_slab_gray);
	public static final BlockSlab half_slab_gray = new BlockHalfSlabBase("half_slab_gray", Material.ROCK, ModBlocks.half_slab_gray, ModBlocks.double_slab_gray);
	// Silver
	public static final BlockSlab double_slab_silver = new BlockDoubleSlabBase("double_slab_silver", Material.ROCK, ModBlocks.half_slab_silver);
	public static final BlockSlab half_slab_silver = new BlockHalfSlabBase("half_slab_silver", Material.ROCK, ModBlocks.half_slab_silver, ModBlocks.double_slab_silver);
	// Cyan
	public static final BlockSlab double_slab_cyan = new BlockDoubleSlabBase("double_slab_cyan", Material.ROCK, ModBlocks.half_slab_cyan);
	public static final BlockSlab half_slab_cyan = new BlockHalfSlabBase("half_slab_cyan", Material.ROCK, ModBlocks.half_slab_cyan, ModBlocks.double_slab_cyan);
	// Purple
	public static final BlockSlab double_slab_purple = new BlockDoubleSlabBase("double_slab_purple", Material.ROCK, ModBlocks.half_slab_purple);
	public static final BlockSlab half_slab_purple = new BlockHalfSlabBase("half_slab_purple", Material.ROCK, ModBlocks.half_slab_purple, ModBlocks.double_slab_purple);
	// Brown
	public static final BlockSlab double_slab_brown = new BlockDoubleSlabBase("double_slab_brown", Material.ROCK, ModBlocks.half_slab_brown);
	public static final BlockSlab half_slab_brown = new BlockHalfSlabBase("half_slab_brown", Material.ROCK, ModBlocks.half_slab_brown, ModBlocks.double_slab_brown);
	// Green
	public static final BlockSlab double_slab_green = new BlockDoubleSlabBase("double_slab_green", Material.ROCK, ModBlocks.half_slab_green);
	public static final BlockSlab half_slab_green = new BlockHalfSlabBase("half_slab_green", Material.ROCK, ModBlocks.half_slab_green, ModBlocks.double_slab_green);
	// Red
	public static final BlockSlab double_slab_red = new BlockDoubleSlabBase("double_slab_red", Material.ROCK, ModBlocks.half_slab_red);
	public static final BlockSlab half_slab_red = new BlockHalfSlabBase("half_slab_red", Material.ROCK, ModBlocks.half_slab_red, ModBlocks.double_slab_red);	
	// Black
	public static final BlockSlab double_slab_black = new BlockDoubleSlabBase("double_slab_black", Material.ROCK, ModBlocks.half_slab_black);
	public static final BlockSlab half_slab_black = new BlockHalfSlabBase("half_slab_black", Material.ROCK, ModBlocks.half_slab_black, ModBlocks.double_slab_black);
	
	// Super duper special rainbow blocks ^_^
	public static Block concrete_special = new BlockBase("concrete_special", Material.ROCK);
	public static Block concrete_stairs_special = new JABCMStairs("concrete_stairs_special", Blocks.CONCRETE.getDefaultState());
	
	// Fences
	public static Block special_fence = new JABCMFence("special_fence");
	public static Block white_fence = new JABCMFence("white_fence");
	public static Block orange_fence = new JABCMFence("orange_fence");
	public static Block magenta_fence = new JABCMFence("magenta_fence");
	public static Block lblue_fence = new JABCMFence("lblue_fence");
	public static Block yellow_fence = new JABCMFence("yellow_fence");
	public static Block lime_fence = new JABCMFence("lime_fence");
	public static Block pink_fence = new JABCMFence("pink_fence");
	public static Block gray_fence = new JABCMFence("gray_fence");
	public static Block silver_fence = new JABCMFence("silver_fence");
	public static Block cyan_fence = new JABCMFence("cyan_fence");
	public static Block purple_fence = new JABCMFence("purple_fence");
	public static Block blue_fence = new JABCMFence("blue_fence");
	public static Block brown_fence = new JABCMFence("brown_fence");
	public static Block green_fence = new JABCMFence("green_fence");
	public static Block red_fence = new JABCMFence("red_fence");
	public static Block black_fence = new JABCMFence("black_fence");
	
	// Pressure Plates
	public static Block special_plate = new JABCMPlate("special_plate", Sensitivity.EVERYTHING);
	public static Block white_plate = new JABCMPlate("white_plate", Sensitivity.MOBS);
	public static Block orange_plate = new JABCMPlate("orange_plate", Sensitivity.MOBS);
	public static Block magenta_plate = new JABCMPlate("magenta_plate", Sensitivity.MOBS);
	public static Block lblue_plate = new JABCMPlate("lblue_plate", Sensitivity.MOBS);
	public static Block yellow_plate = new JABCMPlate("yellow_plate", Sensitivity.MOBS);
	public static Block lime_plate = new JABCMPlate("lime_plate", Sensitivity.MOBS);
	public static Block pink_plate = new JABCMPlate("pink_plate", Sensitivity.MOBS);
	public static Block gray_plate = new JABCMPlate("gray_plate", Sensitivity.MOBS);
	public static Block silver_plate = new JABCMPlate("silver_plate", Sensitivity.MOBS);
	public static Block cyan_plate = new JABCMPlate("cyan_plate", Sensitivity.MOBS);
	public static Block purple_plate = new JABCMPlate("purple_plate", Sensitivity.MOBS);
	public static Block blue_plate = new JABCMPlate("blue_plate", Sensitivity.MOBS);
	public static Block brown_plate = new JABCMPlate("brown_plate", Sensitivity.MOBS);
	public static Block green_plate = new JABCMPlate("green_plate", Sensitivity.MOBS);
	public static Block red_plate = new JABCMPlate("red_plate", Sensitivity.MOBS);
	public static Block black_plate = new JABCMPlate("black_plate", Sensitivity.MOBS);
}
