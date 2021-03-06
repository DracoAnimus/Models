package com.lra.dragon.proxy;

import com.lra.dragon.entities.AquaDraco;
import com.lra.dragon.entities.DracoMortem;
import com.lra.dragon.models.ModelAquaDraco;
import com.lra.dragon.models.ModelDracoMortem;
import com.lra.dragon.render.RenderAquaDraco;
import com.lra.dragon.render.RenderDracoMortem;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

		@Override
	public void registerRenderers(){
			RenderingRegistry.registerEntityRenderingHandler(DracoMortem.class, new RenderDracoMortem(new ModelDracoMortem(), 0.5F));
			RenderingRegistry.registerEntityRenderingHandler(AquaDraco.class, new RenderAquaDraco(new ModelAquaDraco(), 0.5F));

}
}
