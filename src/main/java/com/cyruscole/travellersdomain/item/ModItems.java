package com.cyruscole.travellersdomain.item;

import com.cyruscole.travellersdomain.TravellersDomain;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TravellersDomain.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries){
        entries.add(SAPPHIRE);
        entries.add(RUBY);
    }

    public static void registerModItems(){
        TravellersDomain.LOGGER.info("Registering Mod Items for " + TravellersDomain.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}
