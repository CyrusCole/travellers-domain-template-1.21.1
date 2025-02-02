package com.cyruscole.travellersdomain;

import com.cyruscole.travellersdomain.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TravellersDomain implements ModInitializer {
	public static final String MOD_ID = "travellersdomain";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}