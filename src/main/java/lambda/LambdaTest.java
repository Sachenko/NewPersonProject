package lambda;

import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {

        String[] planets = new String[]{
                "Mercury", "Venus", "VeryLongNameAnotherPlanet", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Li"
        };

        System.out.println(Arrays.toString(planets) + "\n");

        System.out.println("Sort this planets using method Arrays.sort" + "\n" );
        Arrays.sort(planets); //Сортирует в лексикографическом порядке
        System.out.println(Arrays.toString(planets));

        System.out.println("Sort planets by length" + "\n");
        Arrays.sort(planets, (first, second) ->
                first.length() - second.length());
//        Arrays.sort(planets, Comparator.comparingInt(String::length)); //Второй вариант сортировки массива без использования лямбды
        System.out.println(Arrays.toString(planets));
        System.out.println(Instant.EPOCH);

    }

}
