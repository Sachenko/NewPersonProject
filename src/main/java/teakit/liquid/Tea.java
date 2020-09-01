package teakit.liquid;
import teakit.ingredient.TeaLeaf;
//Чай наследуется от воды. В отличие от воды у него есть новые полезные свойста и цвет
//Чай не может появиться без ложки чайного листа и воды

public class Tea extends Water {

    public final String COLOR = "Brown";
    private final TeaLeaf teaLeaf;

    public Tea(TeaLeaf teaLeaf, Water water, int volumeWater) {
        super(volumeWater);
        this.teaLeaf = teaLeaf;
        super.setTempWater(water.getTempWater());
        super.setVolumeWater(water.takeSomeWater(this.getVolumeWater()));
    }

    @Override
    public String toString() {
        return "\n" + "--------------" + "\n"
                + "Is tasty? = " + teaLeaf.isTasty() + "\n"
                + "Volume Tea = " + "\n" + "Temp Tea = "
                + "\n" + "---------------";
    }
}