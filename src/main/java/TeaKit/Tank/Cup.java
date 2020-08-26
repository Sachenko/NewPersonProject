package TeaKit.Tank;

// Имеет небольшой объем и удобную ручку для удобства. Обычно именно из нее наслаждаются напитком.

import TeaKit.Ingredients.TeaLeaf;
import TeaKit.Liquid.HotWater;
import TeaKit.Liquid.Tea;
import TeaKit.Liquid.Water;
import TeaKit.Tank.Reservoir;

public class Cup extends Reservoir {

    public Cup () {}

    public Cup (HotWater hotWater, TeaLeaf teaLeaf) {
        super(300);
        Tea tea = new Tea(teaLeaf,hotWater);
        System.out.println("Create cup Of Tea");
    }



    @Override
    public String toString() {
        return  "---------------" + "\n"
                + "All volume Cup = " + maxVolume + "\n" +
                "Volume inside cup = " + "\n" +
                "Temp inside cup = " + "\n" +
                "---------------"  ;
    }
}
