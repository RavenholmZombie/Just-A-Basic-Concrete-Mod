package rz.mod.blocks.slab;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rz.mod.Main;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class JABCMSpecialHalfSlabBase extends BlockSlabBase implements IHasModel
{
	public JABCMSpecialHalfSlabBase(String name, Material material, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, material, half);
		setHardness(1.8F);
		setResistance(1.8F);
		setSoundType(SoundType.STONE);
		setCreativeTab(Main.JABCMTAB);
		setHarvestLevel("pickaxe", 0);
		
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	public void onEntityWalk(World world, BlockPos pos, Entity entity)
	{
		if(entity instanceof EntityPlayer)
		{
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 3, true, true));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 10, true, true));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5000, 3, true, true));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 10, 1, true, true));
		
		}else if(entity instanceof EntityMob)
		{
			((EntityMob) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 10, 10, true, true));

		}
	}
	
	@Override
	public boolean isDouble()
	{
		return false;
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
