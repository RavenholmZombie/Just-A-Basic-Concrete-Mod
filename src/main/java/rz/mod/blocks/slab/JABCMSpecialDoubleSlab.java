package rz.mod.blocks.slab;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JABCMSpecialDoubleSlab extends BlockSlabBase
{
	public JABCMSpecialDoubleSlab(String name, Material material, BlockSlab half)
	{
		super(name, material, half);
		setHardness(1.8F);
		setResistance(1.8F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
	}
	
	public void onEntityWalk(World world, BlockPos pos, Entity entity)
	{
		if(entity instanceof EntityPlayer)
		{
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 3, true, true));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 10, true, true));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5000, 3, true, true));
		}
	}
	
	@Override
	public boolean isDouble()
	{
		return true;
	}
	
}