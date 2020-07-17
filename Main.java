//You destroyed the former yourself and build something else out of yourself, for in the future you will not build anything from yourself.



import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

       Generation gen = new Generation();
       Person person1 = new Person();

        person1.setMoney(gen.randBalance);
        person1.setName(gen.randName);
        person1.setAge(gen.randomAge);

        System.out.print("You\n");
        System.out.print("Destroyed the former yourself\n");
        System.out.print("And\n");
        System.out.print("Build something else out of yourself\n");
        System.out.print("For in the future you will not build anything from yourself.\n");

        System.out.println("Name=" +person1.getName() + "\n" +
                "Money=" + person1.getMoney() + "\n" +
                "Age="+ person1.getAge());


        




    }
}



