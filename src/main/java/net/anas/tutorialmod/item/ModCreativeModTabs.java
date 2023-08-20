package net.anas.tutorialmod.item;

import net.anas.tutorialmod.TutorialMod;
import net.anas.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANASITEM.get()))
                    .title(Component.translatable("creative_tab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ANASITEM.get());
                        pOutput.accept(ModItems.ANAS.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.POTION_OF_SPEED.get());
                        pOutput.accept(ModItems.POTION_OF_FIRE_RESISTANCE.get());
                        pOutput.accept(ModItems.ANAS_STAFF.get());
                        pOutput.accept(ModItems.ANAS_BLADE.get());
                        pOutput.accept(ModItems.ANAS_AXE.get());
                        pOutput.accept(ModItems.ANAS_SWORD.get());
                        pOutput.accept(ModItems.ANAS_PICKAXE.get());
                        pOutput.accept(ModItems.ANAS_OP_AXE.get());
                        pOutput.accept(ModItems.ANAS_OP_SWORD.get());
                        pOutput.accept(ModItems.ANAS_OP_PICKAXE.get());
                        pOutput.accept(ModItems.ANAS_OP_SHOVEL.get());
                        pOutput.accept(ModItems.ANAS_OP_HOE.get());


                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.PINE_CONE.get());

                        pOutput.accept(ModBlocks.ANASITEM_BLOCK.get());
                        pOutput.accept(ModBlocks.ANAS_BLOCK.get());


                        pOutput.accept(ModBlocks.ANASITEM_ORE.get());
                        pOutput.accept(ModBlocks.DEEP_SLATE_ANASITEM_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_ANASITEM_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_ANASITEM_ORE.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
