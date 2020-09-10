package teakit.ingredient;

public class Sugar {
    private int spoonSugar; //Ложка чайных листьев

    public Sugar(int spoonSugar) {
        this.spoonSugar = spoonSugar;
        System.out.println(toString());
    }

    public Sugar getSugar() {
        return this;
    }

    public int getSpoonSugar() {
        return this.spoonSugar;
    }


    @Override
    public String toString() {
        return  "--------------" + "\n"
                + "Ложка сахара в колличестве " + getSpoonSugar() + "шт";
    }

    public String checkSugar() {
        return "true";
    }
}


