package net.kthulu.mytutorialmod.item;

import net.kthulu.mytutorialmod.MyTutorialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MyTutorialMod.MOD_ID);

    public static final DeferredItem<Item> FLINT_AXE = ITEMS.register("flint_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_PICKAXE = ITEMS.register("flint_pickaxe",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
