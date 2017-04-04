package zoids.Main.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zoids.Main.Main;
import zoids.Main.Reference;
import zoids.Main.blocks.BlockMagnite;
import zoids.Main.blocks.BlockZiSand;
import zoids.Main.util.Utils;

public class ZoidBlocks {
	
	public static Block ZiSand;
	public static Block Magnite;
	
	public static void init() {
		ZiSand = new BlockZiSand("ZiSand", "ZiSand");
		Magnite = new BlockMagnite("Magnite", "Magnite");
		
	}
	
	public static void register(){
		registerBlock(ZiSand);
		registerBlock(Magnite);
		
	}
	
	public static void registerRenders() {
		registerRender(ZiSand);
		registerRender(Magnite);
		
	}
	
	public static void registerBlock(Block block) {
		block.setCreativeTab(Main.blocks);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}
}
