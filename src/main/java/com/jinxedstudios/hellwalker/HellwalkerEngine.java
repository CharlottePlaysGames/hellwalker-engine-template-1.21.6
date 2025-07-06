package com.jinxedstudios.hellwalker;

import com.jinxedstudios.hellwalker.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HellwalkerEngine implements ModInitializer {
	public static final String MOD_ID = "hellwalker";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}