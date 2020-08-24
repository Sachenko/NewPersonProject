package TeaKit;

public class Kettle extends Reservoir {

    private int volumeKettle;
    private int tempKettle;
    private int heatMax;

    public Kettle() {
        super(1500);
    }
    public Kettle(int maxVolume) {
        super(maxVolume);
    }

//Чайник имеет емкость для хранения воды и умеет нагревать содержимое.

//Все что чайник должен уметь делать =  набрать воду, нагревать воду, отдавать нагретую или нет воду !

    public void setMaxWater(Water w)
    {
        w = new Water(w.getWater());
        w.setVolumeWater(super.maxVolume);

    };

    public void setMaxTempWater(Water w)
    {
        w.setTempWater(w.maxTempWater);
    };

  //  public int getHotWater () {

  //    return ;
  //  };

    //для выполнения основных трех методов необходимо добавить вспомогательные

    public int getVolumeKettle() {
        return volumeKettle;} //Возвращает максимальный объем






  //  private int fillFullWater() {
   //     this.volumeKettle = volumeKettle + water1.getWater(maxVolume); //
    //    this.tempKettle = water1.getTempWater();
    //    return water1.setVolumeWater(volumeKettle);}


   // private int preheatKettle() {
   //     this.heatMax = water1.maxTempWater; //Греть воду будем до температуры кипения
   //     for (; tempKettle < heatMax; tempKettle++) ; //Если температура чайника меньше температуры кипения увеличить на 1 градус
    //    return tempKettle;}



}
//     this.tempKettle = water1.setTempWater(tempKettle); // Присваиваем температуру чайника воде
//   this.volume = hotWater1.setVolumeHotWater(volume); // Возвращаем нагретое колличество горячей воды

//Подсказка от Степана
//Надо передать значение, значит нужен метод. set
//Надо забрать значение, значит нужен метод. get
//
//        Kettle k1 = new Kettle();
//        k1.setWater(new Water());
//
//        Kettle k2 = new Kettle();
//        k2.setWater(k1.getWater());

// Так что ты можешь передать объект в метод, внутри метода обновить что-то в объекте.
// И этот объект у тебя будет изменён, так что после вызова метода у тебя будут уже другие значения.
// Например:
//
// Создать чайник;
// Кулер.заполнитьЧайник(чайник);
// чайник.дайВоды();
//
// Вот тут ты передаешь чайник в кулер, и ты этот же чайник используешь уже заполненным