package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_quality_is_0_when_item_name_not_equals_AgedBrie_and_Backstage_and_Sulfuras_and_quality_bigger_than_0() {
        Item[] items = {new Item("Demi",1,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,items[0].getQuality());
    }
    @Test
    public void should_return_quality_2_is_when_item_name_equals_AgedBrie_but_not_equals_Backstage_and_Sulfuras_and_quality_smaller_than_50() {
        Item[] items = {new Item("Aged Brie",1,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(2,items[0].getQuality());
    }

    @Test
    public void should_return_quality_3_is_when_item_name_equals_Backstage_but_not_equals_Sulfuras_and_AgedBrie_and_quality_smaller_than_50_and_sellIn_smaller_than_11_bigger_than_6() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",7,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(3,items[0].getQuality());
    }

    @Test
    public void should_return_quality_is_4_when_item_name_equals_Backstage_but_not_equals_Sulfuras_and_AgedBrie_and_quality_smaller_than_50_and_sellIn_smaller_than_6() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",5,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(4,items[0].getQuality());
    }

    @Test
    public void should_return_sellIn_is_0_when_item_name_not_equals_Sulfuras() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",1,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,items[0].getSellIn());
    }

    @Test
    public void should_return_quality_is_3_when_sellIn_smaller_than_0_item_name_equals_AgedBrie_and_quality_smaller_than_50() {
        Item[] items = {new Item("Aged Brie",-1,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(3,items[0].getQuality());
    }

    @Test
    public void should_return_quality_is_4_when_sellIn_smaller_than_0_item_name_not_equals_AgedBrie_but_equals_Backstage() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",-1,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,items[0].getQuality());
    }
}