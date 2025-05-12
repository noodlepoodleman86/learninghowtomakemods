package net.noodles.coolmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.noodles.coolmod.CoolMod;
import net.noodles.coolmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup MEME_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CoolMod.MOD_ID, "memes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.memes"))
                    .icon(() -> new ItemStack(ModItems.ASTLEY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COOKED);
                        entries.add(ModItems.ASTLEY);

                        entries.add(ModItems.MEME_INGOT);

                        entries.add(Items.DIAMOND);
                        entries.add(ModBlocks.OMNI_BLOCK);

                        // ores
                        entries.add(ModBlocks.MEME_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MEME_ORE);
                        CoolMod.LOGGER.info("lol");

                    }).build());

    public static void registerItemGroups() {
        CoolMod.LOGGER.info("Registering le Item Groups for " + CoolMod.MOD_ID);

    }
}
