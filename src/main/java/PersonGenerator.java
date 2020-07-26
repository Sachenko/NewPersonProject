import java.util.Random;

public class PersonGenerator {

    private String[] names = {"Be_live", "Hope", "Love", "Ivan"};

    public Person generate() {
        Person person = new Person();
        person.setName(generateName());
        person.setAge(generateAge());
        person.setMoney(generateMoney());
        return person;
    }

    public Person generate2() {
        return new Person(generateName(), generateAge(), generateMoney());
    }

    private double generateMoney() {
        double balance = 99999 + Math.random() * 99999;
        return (double) Math.round(balance);
    }

    private int generateAge() {
        double age = 1 + Math.random() * 30;
        return (int) Math.round(age);
    }

    private String generateName() {
        int randIndex = new Random().nextInt(names.length);
        return names[randIndex];
    }

}
