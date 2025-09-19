package net.kthulu.mytutorialmod.item;

import net.kthulu.mytutorialmod.MyTutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyTutorialMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FLINT_ITEMS_TAB = CREATIVE_MODE_TAB.register("flint_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLINT_AXE.get()))
                    .title(Component.translatable( "creativetab.mytutorialmod.flint_items"))


                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
