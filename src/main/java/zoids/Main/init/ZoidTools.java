package zoids.Main.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zoids.Main.Main;
import zoids.Main.Reference;
import zoids.Main.Items.tools.ItemMZiAxe;
import zoids.Main.Items.tools.ItemMZiHoe;
import zoids.Main.Items.tools.ItemMZiPickaxe;
import zoids.Main.Items.tools.ItemMZiShovel;
import zoids.Main.Items.tools.ItemMZiSword;
import zoids.Main.util.Utils;

public class ZoidTools {
	
	public static final ToolMaterial MetalZi = EnumHelper.addToolMaterial(Reference.MODID + ":MetalZi", 2, 2343, 5.0F, 6.0F, 8);
			//if possible make metal zi diamond level, replace 2 with a 3, but add a chance for it to break the block completely, no item
	
	
	public static ItemMZiPickaxe MetalZiPickaxe;
	public static ItemMZiAxe MetalZiAxe;
	public static ItemMZiHoe MetalZiHoe;
	public static ItemMZiShovel MetalZiShovel;
	public static ItemMZiSword MetalZiSword;

	public static void init() {
		MetalZiPickaxe = new ItemMZiPickaxe(MetalZi, "MetalZiPickaxe");
		MetalZiAxe = new ItemMZiAxe(MetalZi, "MetalZiAxe");
		MetalZiHoe = new ItemMZiHoe(MetalZi, "MetalZiHoe");
		MetalZiShovel = new ItemMZiShovel(MetalZi, "MetalZiShovel");
		MetalZiSword = new ItemMZiSword(MetalZi, "MetalZiSword");
		
	}
	
	public static void register() {
		registerItem(MetalZiPickaxe);
		registerItem(MetalZiAxe);
		registerItem(MetalZiHoe);
		registerItem(MetalZiShovel);
		registerItem(MetalZiSword);
		
	}
	
	public static void registerRenders() {
		registerRender(MetalZiPickaxe);
		registerRender(MetalZiAxe);
		registerRender(MetalZiHoe);
		registerRender(MetalZiShovel);
		registerRender(MetalZiSword);
		
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(Main.tools);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}

	
}
