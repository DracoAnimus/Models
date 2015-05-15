package com.lra.dragon;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;

import com.lra.dragon.entities.DracoMortem;
import com.lra.dragon.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = Dragon.MODID, version = Dragon.VERSION)
public class Dragon {
	public static final String MODID = "dragon";
	public static final String VERSION = "1.0";


	@Mod.Instance("dragon")
	public static Dragon instance;
	
	@SidedProxy(clientSide="com.lra.dragon.proxy.ClientProxy", serverSide="com.lra.dragon.proxy.CommonProxy")
	public static CommonProxy proxy;	
	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event){
		proxy.registerRenderers();
	}
	

	@EventHandler
	public void init(FMLInitializationEvent event) {
		registerEntity(DracoMortem.class, "dracoMortem", 0xFFFFFF, 0x58FAF4);
		}
 
	@SuppressWarnings("unchecked")
	public void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
    	int id = EntityRegistry.findGlobalUniqueEntityId();

    	EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
    	EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, bkEggColor, fgEggColor));
   	}

	
}
