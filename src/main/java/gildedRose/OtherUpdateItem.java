package gildedRose;

public class OtherUpdateItem extends UpdateItem {

    @Override
    public void updateQuality(Item item) {
        item.quality = item.decrease1ItemQualty(item);
        item.sellIn = item.decrease1ItemSellIn(item.sellIn);
        if (item.isItemSellInSmallerThan0(item.sellIn))
            if (item.isItemQualityBiggerThan0(item.quality))
                item.quality = item.decrease1ItemQualty(item);
    }
}
