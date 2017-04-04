package zoids.Main.Mobs;

import zoids.Main.Main;
import zoids.Main.Mobs.Entity.EntityShieldLiger;
import zoids.Main.Mobs.renders.RenderShieldLiger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelShield;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry {

	public static void register(){
		MobRegistry.registerRender();
		MobRegistry.registerEntity();
	}
	
	public static void registerRender(){
		RenderingRegistry.registerEntityRenderingHandler(EntityShieldLiger.class, new RenderShieldLiger(Minecraft.getMinecraft().getRenderManager(), new ModelShield(), 7.0F));
		
	}
	
	public static void registerEntity(){
		EntityRegistry.registerModEntity(EntityShieldLiger.class, "Shield Liger", 2301007, Main.instance, 64, 1, true, 0x3B2CDE, 0xE86710);
		
		//EntityRegistry.addSpawn(entityClass, weightedProb, min, max, typeOfCreature, biomes);   (Natural Spawn code)
	}
	
}
