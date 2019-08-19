package gildedRose;

public class AgedBrieUpdateItem extends UpdateItem {
    @Override
    public void updateQuality(Item item) {
        if (item.isItemQqualitySmallerThan50(item.quality))
            item.quality += 1;
        item.decrease1ItemSellIn(item.sellIn);

        if (item.isItemSellInSmallerThan0(item.sellIn))
            item.quality += 1;
    }
}
