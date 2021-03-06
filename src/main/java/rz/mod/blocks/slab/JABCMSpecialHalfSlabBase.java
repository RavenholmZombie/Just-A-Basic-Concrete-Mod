package rz.mod.blocks.slab;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntityZombieHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rz.mod.Main;
import rz.mod.config.JABCMConfig;
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
		if (JABCMConfig.rainbowConcreteEffects)
		{
			if(entity instanceof EntityPlayer)
			{
				((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 3, true, true));
				((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5000, 3, true, true));
				((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 10, 1, true, true));
				((EntityPlayer) entity).setHealth(100F);
				
			}else if(entity instanceof EntityMob)
			{
				((EntityMob) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 10, 10, true, true));
			}
			
			if(entity instanceof EntityZombie)
			{
				((EntityZombie) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 100, 100, true, true));
			}
			if(entity instanceof EntitySkeleton)
			{
				((EntitySkeleton) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 100, 100, true, true));
			}
			if(entity instanceof EntityZombieHorse)
			{
				((EntityZombieHorse) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 100, 100, true, true));
			}
			if(entity instanceof EntityWitherSkeleton)
			{
				((EntityWitherSkeleton) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 100, 100, true, true));
			}
			if(entity instanceof EntitySkeletonHorse)
			{
				((EntitySkeletonHorse) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 100, 100, true, true));
			}
			if(entity instanceof EntitySlime)
			{
				((EntitySlime) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 100, 100, true, true));
			}
			if(entity instanceof EntityMagmaCube)
			{
				((EntityMagmaCube) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 100, 100, true, true));
			}
			if(entity instanceof EntityStray)
			{
				((EntityStray) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 100, 100, true, true));
			}
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
