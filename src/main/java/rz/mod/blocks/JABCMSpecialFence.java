package rz.mod.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rz.mod.Main;
import rz.mod.init.ModBlocks;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class JABCMSpecialFence extends BlockFence implements IHasModel
{
	public JABCMSpecialFence(String name)
	{
		super(Material.ROCK, MapColor.STONE);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.STONE);
		setHardness(8.0F);
		setResistance(8.0F);
		setCreativeTab(Main.JABCMBARRIERS);
		setHarvestLevel("pickaxe", 0);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public void onEntityWalk(World world, BlockPos pos, Entity entity)
	{
		if(entity instanceof EntityMob)
		{
			((EntityMob) entity).setHealth(0.0f);
		}
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
