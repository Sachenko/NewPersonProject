package TeaKit;

// Имеет небольшой объем и удобную ручку для удобства. Обычно именно из нее наслаждаются напитком.

public class Cup extends Reservoir {
    private String cup = "empty Cup";

    public Cup () {
        super(300);
    }

    public String getCup( ) {

        return cup;
    }
}
