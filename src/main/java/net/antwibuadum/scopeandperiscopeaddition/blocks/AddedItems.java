package net.antwibuadum.scopeandperiscopeaddition.blocks;

import net.antwibuadum.scopeandperiscopeaddition.ScopeAndPeriscopeAddition;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AddedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScopeAndPeriscopeAddition.MOD_ID);

    //ublic static final RegistryObject

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
