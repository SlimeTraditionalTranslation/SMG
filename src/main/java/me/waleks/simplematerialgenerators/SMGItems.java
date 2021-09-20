package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class SMGItems {

    private SMGItems() {}

    public static final ItemGroup SMG_ITEM_CATEGORY = new ItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        new CustomItemStack(Material.SMOOTH_STONE, "&9簡單材料製造機")
    );

    public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
        "SMG_GENERATOR_MULTIBLOCK",
        Material.BEDROCK,
        "&9多重方塊製造機",
        "",
        "&d建造任何在此附加的",
        "&d製造機像是這樣.",
        "&a它們只會直接輸出在",
        "&a正上方的儲物箱內."
    );
	
	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&6Rate: &e ticks",
		"",
		"&9&oSimpleMaterialGenerators"
	);
	*/

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        Material.COBBLESTONE,
        "&7鵝卵石製造機",
        "&6速度: &e4 ticks",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        Material.STONE,
        "&7石頭製造機 &8(損壞)",
        "&8需要修復",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        Material.STONE,
        "&7石頭製造機",
        "&6速度: &e8 ticks",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        Material.SMOOTH_STONE,
        "&7平滑石頭製造機 &8(損壞)",
        "&8需要修復",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        Material.SMOOTH_STONE,
        "&7平滑石頭製造機",
        "&6速度: &e12 ticks",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        Material.GRAVEL,
        "&7礫石製造機 &8(損壞)",
        "&8需要修復",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        Material.ANDESITE,
        "&7礫石製造機",
        "&6速度: &e6 ticks",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        Material.SAND,
        "&e沙子製造機 &8(損壞)",
        "&8需要修復",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        Material.SANDSTONE,
        "&e沙子製造機",
        "&6速度: &e8 ticks",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        Material.GLASS,
        "&f玻璃製造機",
        "&6速度: &e12 ticks",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        Material.NETHERRACK,
        "&c地獄石製造機",
        "&6速度: &e6 ticks",
        "",
        "&9&o簡單材料製造機"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        Material.SOUL_SAND,
        "&8靈魂沙製造機",
        "&6速度: &e8 ticks",
        "",
        "&9&o簡單材料製造機"
    );
}