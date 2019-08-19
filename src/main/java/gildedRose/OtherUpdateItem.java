package gildedRose;

public class OtherUpdateItem extends UpdateItem {

    @Override
    public void updateQuality(Item item) {
        item.quality -= 1;
        item.sellIn -=1;
        if (item.isItemSellInSmallerThan0(item.sellIn))
            if (item.isItemQualityBiggerThan0(item.quality))
                item.quality -=1;
    }
}
