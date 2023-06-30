public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();
    person1.setNameAndAge("Роман", 20);
    person2.setNameAndAge("Вова", 30);
}
}
class Person {
    private String name;
   private int age;
   public void setName(String userName){
       name = userName;
   }
   public String getName(){
       return name;
   }
   public void setAge(int userAge){
       age = userAge;
   }
   public int setAge(){
       return age;

   }


    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;

    }
    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void speak(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
    void  sayHello(){
        for (int i = 0; i < 2; i++)
        System.out.println("Hello");
    }
}