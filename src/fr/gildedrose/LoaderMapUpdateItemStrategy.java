package fr.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class LoaderMapUpdateItemStrategy {

    static Map<String, UpdateItemStrategy> mapStrategies;

    static {
        mapStrategies =  new HashMap<>();
        mapStrategies.put("Aged Brie", new AgedBrieUpdateItemStrategy());
        mapStrategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagesUpdateItemStrategy());
        mapStrategies.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdateItemStrategy());
    }

    public static Map<String, UpdateItemStrategy> getMapStrategies() {
        return mapStrategies;
    }
}
