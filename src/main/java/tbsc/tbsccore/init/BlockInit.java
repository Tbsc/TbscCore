package tbsc.tbsccore.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Tbsc on 7/12/2015, 23:07
 */
public class BlockInit {

    public static ConcurrentHashMap<String, Block> registeredBlocks;

    public static void init() {
        // Stub; to be overridden in my mods
    }

    public static Block getBlock(String name) {
        return registeredBlocks.get(name);
    }

    protected static void addBlock(Block block, String name) {
        registeredBlocks.put(name, block);
        GameRegistry.registerBlock(block, name);
    }

}
