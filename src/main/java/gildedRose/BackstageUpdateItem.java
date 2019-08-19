package gildedRose;

public class BackstageUpdateItem extends UpdateItem {
    @Override
    public void updateQuality(Item item) {
        if (item.isItemQqualitySmallerThan50(item.quality))
            item.quality += 1;
        if (item.isItemSellInSmallerThan11(item.sellIn)) {
            if (item.isItemQqualitySmallerThan50(item.quality)) {
                item.quality = item.quality + 1;
            }
        }
        if (item.isItemSellInSmallerThan6(item.sellIn)) {
            if (item.isItemQqualitySmallerThan50(item.quality)) {
                item.quality = item.quality + 1;
            }
        }
        item.sellIn = item.decrease1ItemSellIn(item.sellIn);
        if (item.isItemSellInSmallerThan0(item.sellIn))
            item.quality -= 1;


    }
}
