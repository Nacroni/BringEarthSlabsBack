
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nacroni.bringearthslabsback.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BringearthslabsbackModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(BringearthslabsbackModBlocks.DIRT_SLAB.get().asItem());
			tabData.accept(BringearthslabsbackModBlocks.GRASS_SLAB.get().asItem());
		}
	}
}
