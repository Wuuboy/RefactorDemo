package gildedRose;

import java.util.Arrays;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality()
    {
        for (Item item : items) {
            item.updateItem.updateQuality(item);
        }
    }
}