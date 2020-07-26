
public class Main {

    // 1. ctrl + alt + L

    public static void main(String[] args) {
        PersonGenerator gen = new PersonGenerator();

        Person person1 = gen.generate2();
        System.out.println(person1);

        Person person2 = gen.generate2();
        System.out.println(person2);

        Person person3 = gen.generate2();
        System.out.println(person3);

        Person person4 = gen.generate2();
        System.out.println(person4);
    }

}



