package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_quality_is_when_item_name_equals_AgedBrie_but_not_equals_Backstage_and_Sulfuras_and_quality_bigger_than_0() {
        Item[] items = {new Item("Demi",1,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,items[0].getQuality());
    }

}