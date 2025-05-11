package net.noodles.coolmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.noodles.coolmod.CoolMod;
import net.minecraft.item.Item;
import net.noodles.coolmod.block.ModBlocks;

public class ModItems {
    public static final Item COOKED = registerItem("cook", new Item(new FabricItemSettings()));
    public static final Item ASTLEY = registerItem("astley", new Item(new FabricItemSettings()));
    public static final Item MEME_INGOT = registerItem("meme_ingot", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CoolMod.MOD_ID, name), item);
    }
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(COOKED);
        entries.add(ASTLEY);
        entries.add(MEME_INGOT);
    }
    private static void addItemsToBuildingTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.OMNI_BLOCK);
    }

    public static void registerModItems() {
        CoolMod.LOGGER.info("Registering Mod Items for " + CoolMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingTabItemGroup);
    }
}
