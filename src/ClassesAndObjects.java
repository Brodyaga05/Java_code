public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Роман";
    person1.age = 50;
    Person person2 = new Person();
    person2.name = "Вова";
    person2.age = 20;
    int years1 = person1.calculateYearsToRetirement();
    int years2 = person2.calculateYearsToRetirement();
    int year3 = person1.speak();
    System.out.println("Первому человеку до пенсии: "+ years1 + " лет");
    System.out.println("Первому человеку до пенсии: "+ years2 + " лет");

}

}
class Person {
    String name;
    int age;
   int calculateYearsToRetirement(){
        int years = 65-age;
        String s = "Hello";
        return s;


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