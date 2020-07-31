import Person.Person;
import Person.PersonGenerator;
import TeaKit.Kettle;


public class Main {

    // 1. ctrl + alt + L

    public static void main(String[] args) {
        PersonGenerator gen = new PersonGenerator();
        Kettle kettle = new Kettle();




        Person person1 = gen.generate();
        System.out.println(person1);

        Person person2 = gen.generate();
        System.out.println(person2);


        System.out.println(kettle.fillKettleFullWater());
        System.out.println(kettle.getVolumeKettle());
        System.out.println(kettle.getTempKettle() );
        System.out.println(kettle.getTempKettle() );
        System.out.println(kettle.preheatWater() );


    }

}



