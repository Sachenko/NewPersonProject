package TeaKit;

import TeaKit.Water;

public class Kettle {

    private int maxVolumeKettle = 1000;
    private int volumeKettle;
    private int tempKettle;
    private int heatMax;



    Water water1 = new Water();


    public int fillKettleFullWater() {
        for (; volumeKettle < maxVolumeKettle; ) {
            this.volumeKettle = volumeKettle + water1.getWater();
        }
        this.tempKettle = water1.getTempWater();
        return volumeKettle;
    }

    public void pourWater() {

    }


    public int preheatWater() {
        this.tempKettle = water1.getTempWater();
        this.heatMax = water1.getMaxTempWater();
        for (;tempKettle < heatMax;tempKettle++){}
        return tempKettle;
    }

    public int getVolumeKettle() {
        return volumeKettle;
    }

    public int getTempKettle() {
        return tempKettle;
    }
}
