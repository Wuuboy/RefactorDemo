package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    protected UpdateItem updateItem;


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
        createItemByItemName();
    }

    private void createItemByItemName() {
        switch (this.name){
            case "Aged Brie":
                this.updateItem = new AgedBrieUpdateItem();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                this.updateItem = new BackstageUpdateItem();
                break;
            case "Sulfuras, Hand of Ragnaros":
                this.updateItem = new SulfurasUpdateItem();
                break;
            default:
                this.updateItem = new OtherUpdateItem();
        }

    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected int decrease1ItemSellIn(int sellIn) {
        return sellIn-1;
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

    protected int increase1ItemQualty(Item item) {
        return item.quality+1;
    }
    protected int decrease1ItemQualty(Item item) {
        return item.quality-1;
    }

}
