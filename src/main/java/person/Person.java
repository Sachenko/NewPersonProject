package person;


public class Person implements Comparable<Person> {

    // Поля класса
    private String name;
    private int age;
    private double money;

    public Person() {}

    // Конструктор класса
    public Person(String name, int age, double money) {
        this.name = name;
        this.money = money;
        this.age = age;
    }

    // Метод класса

    public int compareTo(Person otherPerson) {
        return Double.compare(money, otherPerson.money);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + "\n" + "Money = " + getMoney() + "\n" + "Age = " + getAge()
                + "\n" + "" + "\n" + "=============";
    }
}


