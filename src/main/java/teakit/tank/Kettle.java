package teakit.tank;

import teakit.liquid.Water;

public class Kettle extends Reservoir {

    private Water water;

    public Kettle() {
        super(1500);
    }

    public Kettle(int maxVolume) {
        super(maxVolume);
    }

    public void setMaxTempWater(Water w) {
        this.water.setTempWater(Water.MAX_TEMP_WATER);
    }

    public void setWater(Water water) {
        this.water = water;
    }

}

