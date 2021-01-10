package rz.mod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityZombieHorse;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import rz.mod.Main;
import rz.mod.config.JABCMConfig;
import rz.mod.init.ModBlocks;
import rz.mod.init.ModItems;
import rz.mod.util.IHasModel;

public class JABCMSpecialBlock extends Block implements IHasModel
{
	protected static final AxisAlignedBB RAINBOW_BLOCK = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);
	
	public JABCMSpecialBlock(String name, Material material)
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
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		return RAINBOW_BLOCK;
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
		}
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
