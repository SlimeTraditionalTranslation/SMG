package me.waleks.simplematerialgenerators.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

import javax.annotation.Nonnull;

public class GeneratorMultiblock extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

    public GeneratorMultiblock(Category category, SlimefunItemStack item) {
        super(category, item, RecipeType.MULTIBLOCK, new ItemStack[] {
                null, null, null,
                null, new ItemStack(Material.CHEST), null,
                null, new CustomItem(Material.BEDROCK, "任何簡單材料製造機"), null
        });
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            e.cancel();
            e.getPlayer().sendMessage("抱歉, 此物品只是個模型. 你需要將真正的製造機放下.");
        };
    }
}