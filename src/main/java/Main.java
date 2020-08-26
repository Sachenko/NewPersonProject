import Person.Person;
import Person.PersonGenerator;
import TeaKit.Ingredients.TeaLeaf;
import TeaKit.Liquid.Water;
import TeaKit.Tank.Kettle;


public class Main {

    // 1. ctrl + alt + L

    public static void main(String[] args) {
        PersonGenerator gen = new PersonGenerator();
        Person person1 = gen.generate();
        System.out.println(person1);

        Kettle testKettle = new Kettle();
        Water testWater = new Water();
        TeaLeaf spoonTeaLeaf = new TeaLeaf(1);




        System.out.println(spoonTeaLeaf); //Вывожу тест на печать

        testKettle.setMaxWater(testWater); //Наливаю чайник
        testKettle.setMaxTempWater(testWater); //Включаю и нагреваю воду
        System.out.println(testWater); //Вывожу тест на печать после чайника


        System.out.println(); //Вывожу тест

        }
    }





