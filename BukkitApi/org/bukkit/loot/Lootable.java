package org.bukkit.loot;

import org.bukkit.Bukkit;

/**
 * Represents a {@link org.bukkit.block.Container} or a
 * {@link org.bukkit.entity.Mob} that can have a loot table.
 * <br>
 * Container loot will only generate upon opening, and only when the container
 * is <i>first</i> opened.
 * <br>
 * Entities will only generate loot upon death.
 */
public interface Lootable {

    /**
     * Set the loot table for a container or entity.
     * <br>
     * To remove a loot table use null. Do not use {@link LootTables#EMPTY} to
     * clear a LootTable.
     *
     * @param table the Loot Table this {@link org.bukkit.block.Container} or
     * {@link org.bukkit.entity.Mob} will have.
     */
    void setLootTable(LootTable table);

    /**
     * Gets the Loot Table attached to this block or entity.
     * <br>
     *
     * If an block/entity does not have a loot table, this will return null, NOT
     * an empty loot table.
     *
     * @return the Loot Table attached to this block or entity.
     */
    LootTable getLootTable();

    /**
     * Set the seed used when this Loot Table generates loot.
     *
     * @param seed the seed to used to generate loot. Default is 0.
     */
    void setSeed(long seed);

    /**
     * Get the Loot Table's seed.
     * <br>
     * The seed is used when generating loot.
     *
     * @return the seed
     */
    long getSeed();

    /**
     * Get the {@link LootTable} corresponding to this constant. This is
     * equivalent to calling {@code Bukkit.getLootTable(this.getKey());}.
     *
     * @return the associated LootTable
     */
    public LootTable getLootTable() {
        return Bukkit.getLootTable(getKey());
    }
}
