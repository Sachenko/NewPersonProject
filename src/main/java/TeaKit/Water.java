package TeaKit;



public class Water {

//Позже. В классе вода еще должны присутствавать такие параметры как цвет(По умолчанию он должен быть прозрачным) и полезные свойства .

    final int maxTempWater = 100;
    final int minTempWater = 1;
    private int volumeWater;
    private int tempWater;

//При создании объекта класса Water, сработает конструктор который запишет начальное количество воды и ее температуру
//По логике невозможно создать воду не указав ее начальное колличество. Сделать конструктор с присвоением значения колличества

    public Water(int volumeWater) {
        this.tempWater = randomTempWater();
        setVolumeWater(volumeWater);
    }



    public int getWater() {
        return this.volumeWater;
    }

    public int getTempWater() {
        return tempWater;
    }

    public int setTempWater(int t) {
        t = tempWater;
        return tempWater;
    };

    public int setVolumeWater (int v) {
        this.volumeWater = v;
        return volumeWater;
    }



    private int randomTempWater() {
        double temp = 1 + Math.random() * 15;
        return (int) Math.round(temp);
    }

}

