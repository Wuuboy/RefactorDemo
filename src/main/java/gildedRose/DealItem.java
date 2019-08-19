package gildedRose;

public abstract class DealItem {
    GildedRose gildedRose;

    public DealItem(GildedRose gildedRose) {
        this.gildedRose = gildedRose;
    }

    public abstract void addressItem();
}
