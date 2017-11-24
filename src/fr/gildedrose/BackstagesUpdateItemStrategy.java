package fr.gildedrose;

public class BackstagesUpdateItemStrategy implements UpdateItemStrategy {

    @Override
    public void update(Item item) {
        Quality quality = new Quality(item.quality);
        if (item.sellIn > 0) {
            quality.increase(1);
            if (item.sellIn < 11) {
                quality.increase(1);
            }
            if (item.sellIn < 6) {
                quality.increase(1);
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            quality.decrease(quality.value);
        }

        item.quality = quality.value;
    }
}
