package TeaKit.Liquid;

import TeaKit.Ingredients.TeaLeaf;

public class Tea extends HotWater {

    final String color = "Brown";
    //Чай наследуется от воды. В отличие от воды у него есть новые полезные свойста и цвет
    //Чаю нужно записать конструктор, он ведь не может появиться без ложки чайного листа)

    public Tea (TeaLeaf f, HotWater w) {

    }

    public Tea createTea ()
    {
        return this;
    };

    @Override
    public String toString() {
        return "\n" + "--------------" + "\n"
                + "Volume Tea = "  + "\n" + "Temp Tea = "
                + "\n" + "---------------"  ;
    }

}
