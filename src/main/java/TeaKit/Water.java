package TeaKit;


public class Water {
    private String water = "just some qt. water " + getWater() + "with temperature " + getInfoTempWater();
    private int tempWater;
    private int maxTempWater = 100;
    private int volumeWater;
    private int colorWater;

    public Water() {
    }

    private int randomTempWater() {
        double temp = 1 + Math.random() * 15;
        return (int) Math.round(temp);
    }

    public int getWater() {
        return volumeWater = 1;
    }

    public int getInfoTempWater() {
        this.tempWater = randomTempWater();
        return tempWater;
    }

    public int getInfoMaxTempWater() {
        return maxTempWater;
    }
}
