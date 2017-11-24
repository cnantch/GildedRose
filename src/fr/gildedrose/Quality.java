package fr.gildedrose;

public class Quality {

    public int value;

    public Quality(int value) {
        this.value = value;
    }

    public void increase(int v) {
        if (value < 50) {
            value += v;
        }

    }

    public void decrease(int v) {
        if (value > 0) {
            value -= v;
        }
    }

    @Override
    public String toString() {
        return this.value + "";
    }
}

