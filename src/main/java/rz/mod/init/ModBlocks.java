package rz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfStoneSlabNew;
import net.minecraft.block.BlockPressurePlate.Sensitivity;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlabNew;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import rz.mod.blocks.JABCMBlock;
import rz.mod.blocks.JABCMFence;
import rz.mod.blocks.JABCMPlate;
import rz.mod.blocks.JABCMSpecialBlock;
import rz.mod.blocks.JABCMSpecialFence;
import rz.mod.blocks.JABCMStairs;
import rz.mod.blocks.slab.BlockDoubleSlabBase;
import rz.mod.blocks.slab.BlockHalfSlabBase;
import rz.mod.blocks.slab.JABCMSpecialDoubleSlab;
import rz.mod.blocks.slab.JABCMSpecialHalfSlabBase;
import rz.mod.blocks.wall.JABCMWall;

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
	public static final BlockSlab double_slab_special = new JABCMSpecialDoubleSlab("double_slab_special", Material.ROCK, ModBlocks.half_slab_special);
	public static final BlockSlab double_slab_jbrick_special = new JABCMSpecialDoubleSlab("double_slab_jbrick_special", Material.ROCK, ModBlocks.half_slab_jbrick_special);
	public static final BlockSlab half_slab_special = new JABCMSpecialHalfSlabBase("half_slab_special", Material.ROCK, ModBlocks.half_slab_special, ModBlocks.double_slab_special);
	public static final BlockSlab half_slab_jbrick_special = new JABCMSpecialHalfSlabBase("half_slab_jbrick_special", Material.ROCK, ModBlocks.half_slab_jbrick_special, ModBlocks.double_slab_jbrick_special);
	
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
	public static Block concrete_special = new JABCMSpecialBlock("concrete_special", Material.ROCK);
	public static Block concrete_stairs_special = new JABCMStairs("concrete_stairs_special", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_special = new JABCMStairs("jbrick_stairs_special", Blocks.CONCRETE.getDefaultState());
	public static BlockWall concrete_wall_special = new JABCMWall("concrete_wall_special");
	public static BlockWall jbrick_wall_special = new JABCMWall("jbrick_wall_special");
	
	// Fences
	public static Block special_fence = new JABCMSpecialFence("special_fence");
	public static Block white_fence = new JABCMFence("white_fence_jabcm");
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
	
	// Concrete Brick Blocks!
	public static Block jbricks_special = new JABCMSpecialBlock("jbrick_special", Material.IRON);
	public static Block jbricks_white = new JABCMBlock("jbrick_white", Material.ROCK);
	public static Block jbricks_orange = new JABCMBlock("jbrick_orange", Material.ROCK);
	public static Block jbricks_magenta = new JABCMBlock("jbrick_magenta", Material.ROCK);
	public static Block jbricks_lblue = new JABCMBlock("jbrick_lblue", Material.ROCK);
	public static Block jbricks_yellow = new JABCMBlock("jbrick_yellow", Material.ROCK);
	public static Block jbricks_lime = new JABCMBlock("jbrick_lime", Material.ROCK);
	public static Block jbricks_pink = new JABCMBlock("jbrick_pink", Material.ROCK);
	public static Block jbricks_gray = new JABCMBlock("jbrick_gray", Material.ROCK);
	public static Block jbricks_silver = new JABCMBlock("jbrick_silver", Material.ROCK);
	public static Block jbricks_cyan = new JABCMBlock("jbrick_cyan", Material.ROCK);
	public static Block jbricks_purple = new JABCMBlock("jbrick_purple", Material.ROCK);
	public static Block jbricks_blue = new JABCMBlock("jbrick_blue", Material.ROCK);
	public static Block jbricks_brown = new JABCMBlock("jbrick_brown", Material.ROCK);
	public static Block jbricks_green = new JABCMBlock("jbrick_green", Material.ROCK);
	public static Block jbricks_red = new JABCMBlock("jbrick_red", Material.ROCK);
	public static Block jbricks_black = new JABCMBlock("jbrick_black", Material.ROCK);
	
	// Concrete Brick Slabs
	//White
	public static final BlockSlab double_slab_jbrick_white = new BlockDoubleSlabBase("double_slab_jbrick_white", Material.ROCK, ModBlocks.half_slab_jbrick_white);
	public static final BlockSlab half_slab_jbrick_white = new BlockHalfSlabBase("half_slab_jbrick_white", Material.ROCK, ModBlocks.half_slab_jbrick_white, ModBlocks.double_slab_jbrick_white);
	//Orange
	public static final BlockSlab double_slab_jbrick_orange = new BlockDoubleSlabBase("double_slab_jbrick_orange", Material.ROCK, ModBlocks.half_slab_jbrick_orange);
	public static final BlockSlab half_slab_jbrick_orange = new BlockHalfSlabBase("half_slab_jbrick_orange", Material.ROCK, ModBlocks.half_slab_jbrick_orange, ModBlocks.double_slab_jbrick_orange);
	//Magenta
	public static final BlockSlab double_slab_jbrick_magenta = new BlockDoubleSlabBase("double_slab_jbrick_magenta", Material.ROCK, ModBlocks.half_slab_jbrick_magenta);
	public static final BlockSlab half_slab_jbrick_magenta = new BlockHalfSlabBase("half_slab_jbrick_magenta", Material.ROCK, ModBlocks.half_slab_jbrick_magenta, ModBlocks.double_slab_jbrick_magenta);
	//Light Blue
	public static final BlockSlab double_slab_jbrick_lblue = new BlockDoubleSlabBase("double_slab_jbrick_lblue", Material.ROCK, ModBlocks.half_slab_jbrick_lblue);
	public static final BlockSlab half_slab_jbrick_lblue = new BlockHalfSlabBase("half_slab_jbrick_lblue", Material.ROCK, ModBlocks.half_slab_jbrick_lblue, ModBlocks.double_slab_jbrick_lblue);
	//Yellow
	public static final BlockSlab double_slab_jbrick_yellow = new BlockDoubleSlabBase("double_slab_jbrick_yellow", Material.ROCK, ModBlocks.half_slab_jbrick_yellow);
	public static final BlockSlab half_slab_jbrick_yellow = new BlockHalfSlabBase("half_slab_jbrick_yellow", Material.ROCK, ModBlocks.half_slab_jbrick_yellow, ModBlocks.double_slab_jbrick_yellow);
	//Lime
	public static final BlockSlab double_slab_jbrick_lime = new BlockDoubleSlabBase("double_slab_jbrick_lime", Material.ROCK, ModBlocks.half_slab_jbrick_lime);
	public static final BlockSlab half_slab_jbrick_lime = new BlockHalfSlabBase("half_slab_jbrick_lime", Material.ROCK, ModBlocks.half_slab_jbrick_lime, ModBlocks.double_slab_jbrick_lime);
	//Pink
	public static final BlockSlab double_slab_jbrick_pink = new BlockDoubleSlabBase("double_slab_jbrick_pink", Material.ROCK, ModBlocks.half_slab_jbrick_pink);
	public static final BlockSlab half_slab_jbrick_pink = new BlockHalfSlabBase("half_slab_jbrick_pink", Material.ROCK, ModBlocks.half_slab_jbrick_pink, ModBlocks.double_slab_jbrick_pink);
	//Gray
	public static final BlockSlab double_slab_jbrick_gray = new BlockDoubleSlabBase("double_slab_jbrick_gray", Material.ROCK, ModBlocks.half_slab_jbrick_gray);
	public static final BlockSlab half_slab_jbrick_gray = new BlockHalfSlabBase("half_slab_jbrick_gray", Material.ROCK, ModBlocks.half_slab_jbrick_gray, ModBlocks.double_slab_jbrick_gray);
	//Silver
	public static final BlockSlab double_slab_jbrick_silver = new BlockDoubleSlabBase("double_slab_jbrick_silver", Material.ROCK, ModBlocks.half_slab_jbrick_silver);
	public static final BlockSlab half_slab_jbrick_silver = new BlockHalfSlabBase("half_slab_jbrick_silver", Material.ROCK, ModBlocks.half_slab_jbrick_silver, ModBlocks.double_slab_jbrick_silver);
	//Cyan
	public static final BlockSlab double_slab_jbrick_cyan = new BlockDoubleSlabBase("double_slab_jbrick_cyan", Material.ROCK, ModBlocks.half_slab_jbrick_cyan);
	public static final BlockSlab half_slab_jbrick_cyan = new BlockHalfSlabBase("half_slab_jbrick_cyan", Material.ROCK, ModBlocks.half_slab_jbrick_cyan, ModBlocks.double_slab_jbrick_cyan);
	//Purple
	public static final BlockSlab double_slab_jbrick_purple = new BlockDoubleSlabBase("double_slab_jbrick_purple", Material.ROCK, ModBlocks.half_slab_jbrick_purple);
	public static final BlockSlab half_slab_jbrick_purple = new BlockHalfSlabBase("half_slab_jbrick_purple", Material.ROCK, ModBlocks.half_slab_jbrick_purple, ModBlocks.double_slab_jbrick_purple);
	//Blue
	public static final BlockSlab double_slab_jbrick_blue = new BlockDoubleSlabBase("double_slab_jbrick_blue", Material.ROCK, ModBlocks.half_slab_jbrick_blue);
	public static final BlockSlab half_slab_jbrick_blue = new BlockHalfSlabBase("half_slab_jbrick_blue", Material.ROCK, ModBlocks.half_slab_jbrick_blue, ModBlocks.double_slab_jbrick_blue);
	//Brown
	public static final BlockSlab double_slab_jbrick_brown = new BlockDoubleSlabBase("double_slab_jbrick_brown", Material.ROCK, ModBlocks.half_slab_jbrick_brown);
	public static final BlockSlab half_slab_jbrick_brown = new BlockHalfSlabBase("half_slab_jbrick_brown", Material.ROCK, ModBlocks.half_slab_jbrick_brown, ModBlocks.double_slab_jbrick_brown);
	//Green
	public static final BlockSlab double_slab_jbrick_green = new BlockDoubleSlabBase("double_slab_jbrick_green", Material.ROCK, ModBlocks.half_slab_jbrick_green);
	public static final BlockSlab half_slab_jbrick_green = new BlockHalfSlabBase("half_slab_jbrick_green", Material.ROCK, ModBlocks.half_slab_jbrick_green, ModBlocks.double_slab_jbrick_green);
	//Red
	public static final BlockSlab double_slab_jbrick_red = new BlockDoubleSlabBase("double_slab_jbrick_red", Material.ROCK, ModBlocks.half_slab_jbrick_red);
	public static final BlockSlab half_slab_jbrick_red = new BlockHalfSlabBase("half_slab_jbrick_red", Material.ROCK, ModBlocks.half_slab_jbrick_red, ModBlocks.double_slab_jbrick_red);
	//Black
	public static final BlockSlab double_slab_jbrick_black = new BlockDoubleSlabBase("double_slab_jbrick_black", Material.ROCK, ModBlocks.half_slab_jbrick_black);
	public static final BlockSlab half_slab_jbrick_black = new BlockHalfSlabBase("half_slab_jbrick_black", Material.ROCK, ModBlocks.half_slab_jbrick_black, ModBlocks.double_slab_jbrick_black);
	
	// Concrete Brick Stairs
	public static Block jbrick_stairs_white = new JABCMStairs("jbrick_stairs_white", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_orange = new JABCMStairs("jbrick_stairs_orange", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_magenta = new JABCMStairs("jbrick_stairs_magenta", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_blue = new JABCMStairs("jbrick_stairs_blue", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_lblue = new JABCMStairs("jbrick_stairs_lblue", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_yellow = new JABCMStairs("jbrick_stairs_yellow", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_lime = new JABCMStairs("jbrick_stairs_lime", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_pink = new JABCMStairs("jbrick_stairs_pink", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_gray = new JABCMStairs("jbrick_stairs_gray", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_silver = new JABCMStairs("jbrick_stairs_silver", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_cyan = new JABCMStairs("jbrick_stairs_cyan", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_purple = new JABCMStairs("jbrick_stairs_purple", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_brown = new JABCMStairs("jbrick_stairs_brown", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_green = new JABCMStairs("jbrick_stairs_green", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_red = new JABCMStairs("jbrick_stairs_red", Blocks.CONCRETE.getDefaultState());
	public static Block jbrick_stairs_black = new JABCMStairs("jbrick_stairs_black", Blocks.CONCRETE.getDefaultState());

	// Concrete Walls
	public static BlockWall concrete_wall_white = new JABCMWall("concrete_wall_white");
	public static BlockWall concrete_wall_orange = new JABCMWall("concrete_wall_orange");
	public static BlockWall concrete_wall_magenta = new JABCMWall("concrete_wall_magenta");
	public static BlockWall concrete_wall_lblue = new JABCMWall("concrete_wall_lblue");
	public static BlockWall concrete_wall_yellow = new JABCMWall("concrete_wall_yellow");
	public static BlockWall concrete_wall_lime = new JABCMWall("concrete_wall_lime");
	public static BlockWall concrete_wall_pink = new JABCMWall("concrete_wall_pink");
	public static BlockWall concrete_wall_gray = new JABCMWall("concrete_wall_gray");
	public static BlockWall concrete_wall_silver = new JABCMWall("concrete_wall_silver");
	public static BlockWall concrete_wall_cyan = new JABCMWall("concrete_wall_cyan");
	public static BlockWall concrete_wall_purple = new JABCMWall("concrete_wall_purple");
	public static BlockWall concrete_wall_blue = new JABCMWall("concrete_wall_blue");
	public static BlockWall concrete_wall_brown = new JABCMWall("concrete_wall_brown");
	public static BlockWall concrete_wall_green = new JABCMWall("concrete_wall_green");
	public static BlockWall concrete_wall_red = new JABCMWall("concrete_wall_red");
	public static BlockWall concrete_wall_black = new JABCMWall("concrete_wall_black");
	
	//Concrete Brick Walls
	public static BlockWall jbrick_wall_white = new JABCMWall("jbrick_wall_white");
	public static BlockWall jbrick_wall_orange = new JABCMWall("jbrick_wall_orange");
	public static BlockWall jbrick_wall_magenta = new JABCMWall("jbrick_wall_magenta");
	public static BlockWall jbrick_wall_lblue = new JABCMWall("jbrick_wall_lblue");
	public static BlockWall jbrick_wall_yellow = new JABCMWall("jbrick_wall_yellow");
	public static BlockWall jbrick_wall_lime = new JABCMWall("jbrick_wall_lime");
	public static BlockWall jbrick_wall_pink = new JABCMWall("jbrick_wall_pink");
	public static BlockWall jbrick_wall_gray = new JABCMWall("jbrick_wall_gray");
	public static BlockWall jbrick_wall_silver = new JABCMWall("jbrick_wall_silver");
	public static BlockWall jbrick_wall_cyan = new JABCMWall("jbrick_wall_cyan");
	public static BlockWall jbrick_wall_purple = new JABCMWall("jbrick_wall_purple");
	public static BlockWall jbrick_wall_blue = new JABCMWall("jbrick_wall_blue");
	public static BlockWall jbrick_wall_brown = new JABCMWall("jbrick_wall_brown");
	public static BlockWall jbrick_wall_green = new JABCMWall("jbrick_wall_green");
	public static BlockWall jbrick_wall_red = new JABCMWall("jbrick_wall_red");
	public static BlockWall jbrick_wall_black = new JABCMWall("jbrick_wall_black");
}
