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
        this.tempKettle = water1.getInfoTempWater();
        return volumeKettle;
    }


    public int preheatWater() {
        if (volumeKettle > 0) {
            this.tempKettle = water1.getInfoTempWater();
            this.heatMax = water1.getInfoMaxTempWater();
            for (; tempKettle < heatMax; tempKettle++) {
            }
            return tempKettle;
        } else {
            return tempKettle;
        }


    }

    public int getInfoVolumeKettle() {
        return volumeKettle;
    }

    public int getInfoTempKettle() {
        return tempKettle;
    }

    public void getHotWater() {
    }
}
