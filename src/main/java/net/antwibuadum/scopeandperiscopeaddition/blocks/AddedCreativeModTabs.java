package net.antwibuadum.scopeandperiscopeaddition.blocks;

import net.antwibuadum.scopeandperiscopeaddition.ScopeAndPeriscopeAddition;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AddedCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScopeAndPeriscopeAddition.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCOPES_TAB = CREATIVE_MOD_TABS.register("scopes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.GLASS))
                    .title(Component.translatable("creativetab.scopes_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(AddedBlocks.SCOPE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
