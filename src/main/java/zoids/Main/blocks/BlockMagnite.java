package zoids.Main.blocks;

import java.util.Random;

import zoids.Main.Reference;
import zoids.Main.init.ZoidItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BlockMagnite extends Block {

	public BlockMagnite(String UnlocalizedName, String RegistryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(UnlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, RegistryName));
		this.setHardness(3);
		this.setResistance(15);
		this.setHarvestLevel("pickaxe", 2);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ZoidItems.ZoidMagnite;
	}
	
	
}
