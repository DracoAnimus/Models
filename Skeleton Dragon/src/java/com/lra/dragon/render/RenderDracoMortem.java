package com.lra.dragon.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.lra.dragon.entities.DracoMortem;
import com.lra.dragon.models.ModelDracoMortem;

public class RenderDracoMortem extends RenderLiving {

protected ModelDracoMortem model;

private static final ResourceLocation textureLocation = new ResourceLocation("dragon:textures/entities/Draco Mortem.png");

public RenderDracoMortem(ModelBase par1ModelBase, float par2) {
super(par1ModelBase, par2);
model = ((ModelDracoMortem)mainModel);
}

public void renderDracoMortem(DracoMortem entity, double par2, double par4, double par6, float par8, float par9) {
super.doRender(entity, par2, par4, par6, par8, par9);
}

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
renderDracoMortem((DracoMortem)par1EntityLiving, par2, par4, par6, par8, par9);
}

@Override
public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
renderDracoMortem((DracoMortem)entity, d0, d1, d2, f, f1);
}

@Override
protected ResourceLocation getEntityTexture(Entity par1Entity)
{
return textureLocation;
}
}