

class Person {
    //Поля класса
    private String name; //
    private double age;
    private double money;

    public Person() {
    }
    // Конструктор класса
    public Person(String name, double age, double money) {
        this.name = name;
        this.money = money;
        this.age = age;
    }
    //Метод класса

    public String getName() { return name; }

    public void setName(String n) {this.name = n;}

    public double getAge() {
        return age;
    }

    public void setAge(double a) {this.age = a;}

    public double getMoney() {
        return money;
    }

    public void setMoney(double m) {this.money = m ;}

}


