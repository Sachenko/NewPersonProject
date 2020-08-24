import Person.Person;
import Person.PersonGenerator;
import TeaKit.Kettle;
import TeaKit.Water;


public class Main {

    // 1. ctrl + alt + L

    public static void main(String[] args) {
        PersonGenerator gen = new PersonGenerator();
        Person person1 = gen.generate();
        System.out.println(person1);

        Kettle testKettle = new Kettle();
        Water testWater = new Water(testKettle.maxVolume);
        testKettle.setMaxWater(testWater); //Наливаю чайник
        testKettle.setMaxTempWater(testWater); //Включаю и нагреваю воду
        System.out.println(testWater.getTempWater());
    }


}


