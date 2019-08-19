package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality()
    {
        for (int i = 0; i< items.length; i++) {
            items[i].updateItem.updateQuality(items[i]);
        }

//        for (int i = 0; i< items.length; i++) {
//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].isItemQualityBiggerThan0(items[i].quality)) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
////                        decrease1ItemQuality(i, 1);
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].isItemQqualitySmallerThan50(items[i].quality)) {
////                    increaseItemQuality(i);
//                    items[i].quality = items[i].quality + 1;
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].isItemSellInSmallerThan11(items[i].sellIn)) {
//                            if (items[i].isItemQqualitySmallerThan50(items[i].quality)) {
////                                increaseItemQuality(i);
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].isItemSellInSmallerThan6(items[i].sellIn)) {
//                            if (items[i].isItemQqualitySmallerThan50(items[i].quality)) {
////                                increaseItemQuality(i);
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].decrease1ItemSellIn(items[i].sellIn);
//            }
//
//            if (items[i].isItemSellInSmallerThan0(items[i].sellIn)) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].isItemQualityBiggerThan0(items[i].quality)) {
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
////                                decrease1ItemQuality(i, items[i].quality);
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
////                        decrease1ItemQuality(i, items[i].quality);
//                        items[i].quality = items[i].quality - 1;
//                    }
//                } else {
//                    if (items[i].isItemQqualitySmallerThan50(items[i].quality)) {
////                        increaseItemQuality(i);
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
    }



//    protected void increaseItemQuality(int i) {
//        items[i].quality = items[i].quality + 1;
//    }
//
//    protected void decrease1ItemQuality(int i, int i2) {
//        items[i].quality = items[i].quality - 1;
//    }


}