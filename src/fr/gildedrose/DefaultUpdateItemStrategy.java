package fr.gildedrose;

public class DefaultUpdateItemStrategy implements UpdateItemStrategy {

    @Override
    public void update(Item item) {
        Quality quality = new Quality(item.quality);
        quality.decrease(1);
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            quality.decrease(1);
        }
        item.quality = quality.value;
    }
}
