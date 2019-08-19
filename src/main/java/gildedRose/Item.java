package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    protected UpdateItem updateItem;

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        if (this.name == "Aged Brie"){
            this.updateItem =new AgedBrieUpdateItem();
        }else if (this.name == "Backstage passes to a TAFKAL80ETC concert"){
            this.updateItem =new BackstageUpdateItem();
        }else if (this.name == "Sulfuras, Hand of Ragnaros"){
            this.updateItem =new SulfurasUpdateItem();
        }else {
            this.updateItem = new OtherUpdateItem();
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
    protected int decrease1ItemSellIn(int sellIn) {
        return sellIn - 1;
    }

    protected boolean isItemSellInSmallerThan11(int sellIn) {
        return sellIn < 12;
    }

    protected boolean isItemSellInSmallerThan6(int sellIn) {
        return sellIn < 6;
    }

    protected boolean isItemSellInSmallerThan0(int sellIn) {
        return sellIn < 0;
    }

    protected boolean isItemQualityBiggerThan0(int quality) {
        return quality > 0;
    }

    protected boolean isItemQqualitySmallerThan50(int quality) {
        return quality < 50;
    }

}
