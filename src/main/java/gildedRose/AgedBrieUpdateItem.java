package gildedRose;

public class AgedBrieUpdateItem extends UpdateItem {
    @Override
    public void updateQuality(Item item) {
        if (item.isItemQqualitySmallerThan50(item.quality))
            item.quality = item.increase1ItemQualty(item);
        item.decrease1ItemSellIn(item.sellIn);
        if (item.isItemSellInSmallerThan0(item.sellIn))
            item.quality = item.increase1ItemQualty(item);
    }
}
