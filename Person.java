import java.util.Scanner;
import java.util.Random;

public class Person {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name now? ");
        String name = in.nextLine();

        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.print("I do not want to ask about money");


        double years = age + Math.random()*50;
        int newYears = (int)Math.round(years);
        double balance = 800000 + Math.random()*1000000;
        int newBalance = (int)Math.round(balance);
        String[] aName = {"Vasia","Petia","Igor","Zilda","Pilda","Milda","Volda","Balda","Robl","Mobl"};
        String randName = aName[new Random().nextInt(aName.length)];


        String[] people = new String[1];
        people[0] = "\n\nOk\n " + name + "\n Your new name is = "+randName+" " +
                "\nNow you don't " + age + " your new age is "+newYears+"  " +
        "\nAnd now You "+ randName + " have in your balance "+newBalance+"$ ";


        for (String g : people)
            System.out.println(g);
    }
}
