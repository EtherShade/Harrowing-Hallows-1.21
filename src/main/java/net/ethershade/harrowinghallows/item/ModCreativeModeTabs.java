package net.ethershade.harrowinghallows.item;

import net.ethershade.harrowinghallows.HarrowingHallows;
import net.ethershade.harrowinghallows.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HarrowingHallows.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HARROWING_HALLOWS_TAB = CREATIVE_MODE_TABS.register("harrowing_hallows_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STYXITE_INGOT.get()))
                    .title(Component.translatable("creativetab.harrowinghallows.harrowing_hallows_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STYXITE_INGOT.get());
                        output.accept(ModItems.RAW_STYXITE.get());
                        output.accept(ModItems.STYXITE_SWORD.get());
                        output.accept(ModItems.STYXITE_PICKAXE.get());
                        output.accept(ModItems.STYXITE_SHOVEL.get());
                        output.accept(ModItems.STYXITE_AXE.get());
                        output.accept(ModItems.STYXITE_HOE.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
