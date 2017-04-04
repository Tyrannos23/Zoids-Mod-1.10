package zoids.Main.init;

import zoids.Main.Main;
import zoids.Main.Reference;
import zoids.Main.Items.ItemIronRod;
import zoids.Main.Items.ItemMZiIngot;
import zoids.Main.Items.ItemZoidMagnite;
import zoids.Main.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZoidItems {
	
	public static Item ZoidMagnite;
	public static Item MZiIngot;
	public static Item IronRod;
	
	public static void init() {
		ZoidMagnite = new ItemZoidMagnite("ZoidMagnite", "ZoidMagnite");
		MZiIngot = new ItemMZiIngot("MZiIngot", "MZiIngot");
		IronRod = new ItemIronRod("IronRod", "IronRod");
		
	}
	
	public static void register() {
		registerItem(ZoidMagnite);
		registerItem(MZiIngot);
		registerItem(IronRod);
	}
	
	public static void registerRenders() {
		registerRender(ZoidMagnite);
		registerRender(MZiIngot);
		registerRender(IronRod);
		
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(Main.items);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}

}
