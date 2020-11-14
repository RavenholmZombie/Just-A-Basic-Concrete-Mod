package rz.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import rz.mod.Main;
import rz.mod.init.ModBlocks;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class JABCMBlock extends Block implements IHasModel
{
	public JABCMBlock(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.JABCMTAB);
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
