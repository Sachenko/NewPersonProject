package teakit.ingredient;

public class TeaLeaf {

    private int spoonLeaf; //Ложка чайных листьев

    public TeaLeaf(int spoonLeaf) {
        this.spoonLeaf = spoonLeaf;
    }

    public TeaLeaf getTeaLeaf() {
        return this;
    }

    public int getSpoonLeaf() {
        return this.spoonLeaf;
    }


    @Override
    public String toString() {
        return "\n" + "--------------" + "\n"
                + "Ложка чайных листьев в колличестве " + getSpoonLeaf() + "шт"
                + "\n" + "---------------";
    }

    public String isTasty() {
        return "true";
    }
}
