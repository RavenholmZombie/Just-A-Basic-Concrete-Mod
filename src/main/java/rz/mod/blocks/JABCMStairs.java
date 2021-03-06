package rz.mod.blocks;

import java.util.List;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import rz.mod.Main;
import rz.mod.init.ModBlocks;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class JABCMStairs extends BlockStairs implements IHasModel
{
	public JABCMStairs(String name, IBlockState modelState)
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.8F);
		setResistance(1.8F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(Main.JABCMTAB);
		
		this.useNeighborBrightness = true;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
