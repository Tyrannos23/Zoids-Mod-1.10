package zoids.Main.blocks;

import java.util.Random;

import zoids.Main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BlockZiSand extends Block{

	public BlockZiSand(String UnlocalizedName, String RegistryName) {
		super(Material.SAND);
		this.setUnlocalizedName(UnlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, RegistryName));
		this.setSoundType(SoundType.SAND);
		this.setHardness(1);
		this.setResistance(5);
		this.setHarvestLevel("shovel", 0);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
	
}
