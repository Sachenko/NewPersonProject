package teakit.tank;

import teakit.ingredient.TeaLeaf;
import teakit.liquid.Tea;
import teakit.liquid.Water;

// Имеет небольшой объем и удобную ручку для удобства. Обычно именно из нее наслаждаются напитком.
public class Cup extends Reservoir {

    private Tea tea;

    public Cup(Water water, TeaLeaf teaLeaf) {
        super(300);
        this.tea = new Tea(teaLeaf, water, 300);
        System.out.println("Create cup Of Tea");
    }

    @Override
    public String toString() {
        return "---------------" + "\n"
                + "All volume Cup = " + maxVolume + "\n" +
                "Volume inside cup = " + tea.getVolumeWater() + "\n" +
                "Temp inside cup = " + tea.getTempWater() + "\n" +
                "---------------";
    }
}
