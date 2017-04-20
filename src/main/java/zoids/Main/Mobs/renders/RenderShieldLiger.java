package zoids.Main.Mobs.renders;

import org.lwjgl.opengl.GL11;

import zoids.Main.Reference;
import zoids.Main.Mobs.Entity.EntityShieldLiger;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderShieldLiger extends RenderLiving<EntityShieldLiger> {
	
//	@Override
//	public void renderName(EntityLivingBase entityliving, double d, double d1, double d2) {
//	}
	//this code might not be needed
	
	public static final ResourceLocation ShieldLiger = new ResourceLocation(Reference.MODID, ":textures/entity/ShieldLiger/ShieldLiger.png");
	
    protected void preRenderScale(EntityShieldLiger entity, float par2)
    {
    GL11.glScalef(4.5F, 4.5F, 4.5F);  //First is for X(width), Second is Y (height), and Final is Z (length)
    }
    
	public RenderShieldLiger(RenderManager rendermanagerIn,
			ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityShieldLiger entity) {
		return ShieldLiger;
	}

	
}
