package teakit.liquid;
import teakit.ingredient.TeaLeaf;
//Чай является водой. В отличие от воды у него есть новые полезные свойста и цвет
//Чай не может появиться чайного листа и воды

public class Tea extends Water {

    public final String COLOR = "Brown";
    private final TeaLeaf teaLeaf;

    public Tea(TeaLeaf teaLeaf, Water water, int volumeWater) {
        super(volumeWater);
        if(water.getTempWater() < MAX_TEMP_WATER ) {
            throw new IllegalArgumentException();
        } else {
            this.teaLeaf = teaLeaf;
            super.setTempWater(water.getTempWater());
            super.setVolumeWater(water.takeSomeWater(this.getVolumeWater()));
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return  "--------------" + "\n"
                + "It is tea? = " + teaLeaf.checkTea() + "\n"
                + "Volume Tea = " + getVolumeWater() + "\n" + "Temp Tea = " + getTempWater();
    }
}