import java.util.Random;

class Generation {

    //Поля класса
    private int age;
    private double balance;
    private String name;

    public Generation() {}
    public Generation(int age, double balance, String name){
        this.age = age;
        this.balance = balance;
        this.name = name;
    }

      public double newAge =  + Math.random()*50;
      public int randomAge = (int)Math.round(newAge);
      public int getAge() {return age;}
      public void setAge(int randomAge) {this.age = randomAge;}

      public double newBalance = 800000 + Math.random()*1000000;
      public double randBalance = (double) Math.round(newBalance);
      public double getBalance() {return balance;}
      public void setBalance (double randBalance) {this.balance = randBalance;}

      String[] aName = {"Vasia","Petia","Igor","Zilda","Pilda","Milda","Volda","Balda","Robl","Mobl"};
      String randName = aName[new Random().nextInt(aName.length)];
      public String getName() {return name;}
      public void setName(String randName) {this.name = randName;}
}

