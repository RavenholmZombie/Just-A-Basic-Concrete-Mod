package rz.mod.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import rz.mod.Main;
import rz.mod.init.ModBlocks;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class JABCMFence extends BlockFence implements IHasModel
{
	public JABCMFence(String name)
	{
		super(Material.ROCK, MapColor.STONE);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.JABCMTAB);
		setSoundType(SoundType.STONE);
		setHardness(8.0F);
		setResistance(8.0F);
		setHarvestLevel("pickaxe", 0);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
