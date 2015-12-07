package tbsc.tbsccore.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Tbsc on 7/12/2015, 23:06
 */
public class ItemInit {

    public static ConcurrentHashMap<String, Item> registeredItems;

    public static void init() {
        // Stub; to be overridden in my mods
    }

    public static Item getItem(String name) {
        return registeredItems.get(name);
    }

    private static void addItem(Item item, String name) {
        registeredItems.put(name, item);
        GameRegistry.registerItem(item, name);
    }

}
