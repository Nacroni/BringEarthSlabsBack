
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nacroni.bringearthslabsback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.nacroni.bringearthslabsback.block.PetrifiedGrassSlabBlock;
import com.nacroni.bringearthslabsback.block.PetrifiedDirtSlabBlock;
import com.nacroni.bringearthslabsback.block.GrassSlabBlock;
import com.nacroni.bringearthslabsback.block.DirtSlabBlock;
import com.nacroni.bringearthslabsback.BringearthslabsbackMod;

public class BringearthslabsbackModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BringearthslabsbackMod.MODID);
	public static final RegistryObject<Block> PETRIFIED_DIRT_SLAB = REGISTRY.register("petrified_dirt_slab", () -> new PetrifiedDirtSlabBlock());
	public static final RegistryObject<Block> DIRT_SLAB = REGISTRY.register("dirt_slab", () -> new DirtSlabBlock());
	public static final RegistryObject<Block> GRASS_SLAB = REGISTRY.register("grass_slab", () -> new GrassSlabBlock());
	public static final RegistryObject<Block> PETRIFIED_GRASS_SLAB = REGISTRY.register("petrified_grass_slab", () -> new PetrifiedGrassSlabBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			GrassSlabBlock.blockColorLoad(event);
			PetrifiedGrassSlabBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			GrassSlabBlock.itemColorLoad(event);
			PetrifiedGrassSlabBlock.itemColorLoad(event);
		}
	}
}
