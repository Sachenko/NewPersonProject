package TeaKit;

public class Kettle extends Reservoir {

    private int volumeKettle;

    public Kettle() {
        super(1500);
    }

    public Kettle(int maxVolume) {
        super(maxVolume);
    }

    public void setMaxWater(Water w) {
        w.setVolumeWater(super.maxVolume);
    }

    public void setMaxTempWater(Water w) {
        w.setTempWater(w.maxTempWater);
    }

    public int getVolumeKettle() {
        return volumeKettle;
    } //Возвращает максимальный объем

}

