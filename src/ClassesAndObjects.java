public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("Роман");
    person1.age = 50;
    Person person2 = new Person();
    person2.name = "Вова";
    person2.age = 20;



}

}
class Person {
    String name;
    int age;

    void setName(String username){
        name = username;
    }


   int calculateYearsToRetirement(){
        int years = 65-age;
        return years;


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