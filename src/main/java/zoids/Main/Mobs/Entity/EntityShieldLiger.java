package zoids.Main.Mobs.Entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityShieldLiger extends EntityLiving {

	public EntityShieldLiger(World worldIn) {
		super(worldIn);
		this.setSize(21.6F, 9F);
	}
	
    public int getMaxFallHeight()
    {
        if (this.getAttackTarget() == null)
        {
            return 18;
        }
        else
        {
            int i = (int)(this.getHealth() - this.getMaxHealth() * 0.33F);
            i = i - (3 - this.worldObj.getDifficulty().getDifficultyId()) * 4;

            if (i < 0)
            {
                i = 0;
            }

            return i + 18;
        }
    }

}
