package com.example.exampleaddon.item;

import com.example.exampleaddon.ExampleAddon;
import com.example.exampleaddon.entity.AddonEntities;
import com.fodk.gemcolony.item.custom.GemItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AddonItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleAddon.MOD_ID);

    //thorium_gem is the id for the registered item, Name = Thorium is needed for display and entity name
    public static final DeferredItem<Item> THORIUM_GEM = ITEMS.registerItem("thorium_gem",
            properties -> new GemItem(properties, "Thorium", AddonEntities.THORIUM.get()));

    //get resource key for item tags
    public static ResourceKey<Item> getRK(DeferredItem deferredItem){
        return BuiltInRegistries.ITEM.getResourceKey(deferredItem.asItem()).get();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
