package net.ethershade.harrowinghallows.item;

import net.ethershade.harrowinghallows.HarrowingHallows;
import net.ethershade.harrowinghallows.item.custom.HammerItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HarrowingHallows.MOD_ID);

    public static final RegistryObject<Item> STYXITE_INGOT = ITEMS.register("styxite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STYXITE = ITEMS.register("raw_styxite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STYXITE_SWORD = ITEMS.register("styxite_sword",
            () -> new SwordItem(ModToolTiers.STYXITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STYXITE, 3, -2.4f))));
    public static final RegistryObject<Item> STYXITE_PICKAXE = ITEMS.register("styxite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STYXITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STYXITE, 1, -2.8f))));
    public static final RegistryObject<Item> STYXITE_SHOVEL = ITEMS.register("styxite_shovel",
            () -> new ShovelItem(ModToolTiers.STYXITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.STYXITE, 1.5f, -3.0f))));
    public static final RegistryObject<Item> STYXITE_AXE = ITEMS.register("styxite_axe",
            () -> new AxeItem(ModToolTiers.STYXITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.STYXITE, 6, -3.2f))));
    public static final RegistryObject<Item> STYXITE_HOE = ITEMS.register("styxite_hoe",
            () -> new HoeItem(ModToolTiers.STYXITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.STYXITE, 0, -3.0f))));
    public static final RegistryObject<Item> STYXITE_HAMMER = ITEMS.register("styxite_hammer",
            () -> new HammerItem(ModToolTiers.STYXITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STYXITE, 7, -3.5f))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
