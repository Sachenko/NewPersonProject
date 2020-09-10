package teakit;

import teakit.ingredient.TeaLeaf;
import teakit.liquid.Water;
import teakit.tank.Cup;
import teakit.tank.Kettle;
import teakit.tank.TeaKettle;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class Main {

    public static void main (String[] args) {

//Hello User. Тут ты сможешь узнать рецепт вкусного чая, и сделать его у себя дома или в офисе.
//Обычно в рецептах сразу после текстового описания действия добавляют фотографии, а тут будет код Java.
//Добавь капельку воображения и просто прочитай названия классов и методов, и Ты User сможешь создать вкусный чай.


        //1)User Attention. Перед началом работ убедись что у тебя есть минимальный набор для приготовления чая.
        //Starter kit includes - Воду, Чайный лист, устройство для нагрева воды и емкость для употребления напитка.
        //Much better if you have емкость для заваривания чайного листа и дополнительные ингридиенты например сахар, фрукты, мята и тп.
        //Plz don't use водопроводную воду, заказывай бутилированную или очищай через хорошие фильтры.



        Kettle testKettle = new Kettle();
        Cup testCup = new Cup();
        Water testWater = new Water();
        TeaLeaf teaLeaf = new TeaLeaf(1);

        //2) User дальше тебе надо нагреть воду. Используй для этого чайник.
        //От того насколько чистая вода будет зависеть конечный вкус Чая.
        //Внимательно посмотри и запомни максимальную вместимость чайника.
        int maxVolumeFromKettle = testKettle.getMaxVolume();

        //Убедись что тебя есть необходимое количество воды для заполнения емкости.
        testWater.setVolumeWater(maxVolumeFromKettle);
        //Заполни емкость до максимального знеачения. Можно меньше максимума, но не больше.
        testKettle.setWater(testWater);


        //После выпонения всех действий описанных выше, у тебя должен быть чайник наполненный водой (Надеюсь чистой)
        //Теперь надо нагреть воду в чайнике, и получить горячую воду.
        testKettle.setMaxTempWater(testWater);
        System.out.println(testWater);




        //Now you have minimal kit for creating Tea. Of course you can make ordinary tea inside cup.
        testCup.createOfOrdinaryTea(testWater,teaLeaf);
        System.out.println(testWater.toString());
        //But it is no interest...
        //Offer make tasty Tea inside Tea Kettle with addition tasty ingredients
        //E.G. very tasty Tea with slice of lemon, grapefruit, lime and leaves mint with addition honey or sugar.










//        Cup cup = new Cup(testWater, teaLeaf);
//       System.out.println(cup);
//        System.out.println(testWater);

    }
}
