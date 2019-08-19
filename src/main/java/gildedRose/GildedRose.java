package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i< items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (isItemQualityBiggerThan0(items[i])) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        decrease1ItemQuality(i, 1);
                    }
                }
            } else {
                if (isItemQqualitySmallerThan50(items[i].quality, 50)) {
                    increaseItemQuality(i);

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (isItemSellInSmallerThan11(items[i].sellIn, 11)) {
                            if (isItemQqualitySmallerThan50(items[i].quality, 50)) {
                                increaseItemQuality(i);
                            }
                        }

                        if (isItemSellInSmallerThan6(items[i].sellIn, 6)) {
                            if (isItemQqualitySmallerThan50(items[i].quality, 50)) {
                                increaseItemQuality(i);
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (isItemSellInSmallerThan0(items[i].sellIn, 0)) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (isItemQualityBiggerThan0(items[i])) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                decrease1ItemQuality(i, items[i].quality);
                            }
                        }
                    } else {
                        decrease1ItemQuality(i, items[i].quality);
                    }
                } else {
                    if (isItemQqualitySmallerThan50(items[i].quality, 50)) {
                        increaseItemQuality(i);
                    }
                }
            }
        }
    }

    private boolean isItemSellInSmallerThan11(int sellIn, int i2) {
        return sellIn < i2;
    }

    private boolean isItemSellInSmallerThan6(int sellIn, int i2) {
        return sellIn < i2;
    }

    private boolean isItemSellInSmallerThan0(int sellIn, int i2) {
        return sellIn < i2;
    }

    private boolean isItemQualityBiggerThan0(Item item) {
        return item.quality > 0;
    }

    private boolean isItemQqualitySmallerThan50(int quality, int i2) {
        return quality < i2;
    }

    private void increaseItemQuality(int i) {
        items[i].quality = items[i].quality + 1;
    }

    private void decrease1ItemQuality(int i, int i2) {
        items[i].quality = items[i].quality - i2;
    }


}