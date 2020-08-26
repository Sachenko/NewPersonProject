package TeaKit.Liquid;


public class Water {

    final int maxTempWater = 100;
    final int minTempWater = 1;
    private int volumeWater;
    private int tempWater;

    public Water() {
        this.tempWater = randomTempWater();
        setVolumeWater(1);
    }

    public Water(int volumeWater){
        this.volumeWater = volumeWater;
        this.tempWater = randomTempWater();
    }

    public Water getWater() {
        return this;
    }
    public int getTempWater() {
        return tempWater;
    }
    public int getVolumeWater() {return volumeWater;}
    public int getMaxTempWater() {return maxTempWater;}

    public int setTempWater(int t) {
        this.tempWater = t;
        return tempWater;
    }

    public int setVolumeWater (int v) {
        this.volumeWater = v;
        return volumeWater;
    }
    
    private int randomTempWater() {
        double temp = 1 + Math.random() * 15;
        return (int) Math.round(temp);
    }

    @Override
    public String toString() {
        return "\n" + "--------------" + "\n"
                + "Volume Water = " + getVolumeWater() + "\n" + "Temp Water = " + getTempWater()
                + "\n" + "---------------"  ;
    }
}

