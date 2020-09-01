package teakit.liquid;


public class Water {

    public static final int MAX_TEMP_WATER = 100;
    public static final int MIN_TEMP_WATER = 1;
    public static final int MIN_VOLUME_WATER = 1;

    private int volumeWater;
    private int tempWater;

    public Water() {
        this(MIN_VOLUME_WATER);
    }

    public Water(int volumeWater) {
        this.volumeWater = volumeWater;
        this.tempWater = randomTempWater();
    }


    public int getTempWater() {
        return tempWater;
    }

    public int getVolumeWater() {
        return volumeWater;
    }

    public void setVolumeWater(int volumeWater) {
        this.volumeWater = volumeWater;
    }

    public void setTempWater(int tempWater) {
        this.tempWater = tempWater;
    }

    private int randomTempWater() {
        double temp = 1 + Math.random() * 15;
        return (int) Math.round(temp);
    }

    protected int takeSomeWater(int volumeWater) {
        if (this.volumeWater >= volumeWater) {
            this.volumeWater -= volumeWater;
            return volumeWater;
        }

        int currentWater = this.volumeWater;
        this.volumeWater = 0;
        this.tempWater = 0;

        return currentWater;
    }
    @Override
    public String toString() {
        return "\n" + "--------------" + "\n"
                + "Volume Water = " + getVolumeWater() + "\n" + "Temp Water = " + getTempWater()
                + "\n" + "---------------";
    }
}


