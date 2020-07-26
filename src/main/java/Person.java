
class Person {

    // Поля класса
    private String name;
    private int age;
    private double money;

    public Person() {
    }

    // Конструктор класса
    public Person(String name, int age, double money) {
        this.name = name;
        this.money = money;
        this.age = age;
    }

    // Метод класса

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double m) {
        this.money = m;
    }

    @Override
    public String toString() {
        return "Name=" + getName() + "\n" + "Money=" + getMoney() + "\n" + "Age=" + getAge();
    }
}


