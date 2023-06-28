public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Роман";
    person1.age = 50;
    Person person2 = new Person();
    person2.name = "Вова";
    person2.age = 20;
    person1.calculateYearsToRetirement();
    person2.calculateYearsToRetirement();

}

}
class Person {
    String name;
    int age;
    void calculateYearsToRetirement(){
        int years = 65-age;
        System.out.println("Количество лет до пенсии: " + years);

    }
    void speak(){
        for (int i = 0; i < 3; i++)
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
    void  sayHello(){
        for (int i = 0; i < 2; i++)
        System.out.println("Hello");

    }
}