package TeaKit;

public class Water {

    final int maxTempWater = 100;
    final int minTempWater = 1;
    private int volumeWater;
    private int tempWater;

//При создании объекта класса Water, сработает конструктор который запишет начальное количество воды и ее температуру
//По логике невозможно создать воду не указав ее начальное колличество. Сделать конструктор с присвоением значения колличества

    public Water() {
        this.tempWater = randomTempWater();
        setVolumeWater(volumeWater);
    }

    public Water getWater() {
        return this;
    }
    public int getTempWater() {
        return tempWater;
    }
    public int getVolumeWater() {return volumeWater;}

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

