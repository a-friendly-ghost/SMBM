
package net.mcreator.extrabuildingblocks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LaceItem extends Item {
	public LaceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
