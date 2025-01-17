package io.github.beez131github.betr_table;

import net.minecraft.registry.tag.EnchantmentTags;
import org.quiltmc.loader.api.ModContainer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetrTable implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Better Enchant Table");

    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }

	@Override
	public void onInitialize() {

	}
}
