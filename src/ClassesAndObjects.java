public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("Воладеморт");
    person1.setAge(123);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());

    person1.speak();

}
}
class Person {
    private String name;
   private int age;
   public void setName(String userName){
     if (userName.isEmpty()){
           System.out.println("Ты ввел пустое имя");
       } else {
         name = userName;
       }
       name = userName;
   }
   public String getName(){
       return name;
   }
   public void setAge(int userAge){
       age = userAge;
   }
   public int getAge(){
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
        System.out.println("Меня зовут " + name + ", мне " + age + " года");
    }
    void  sayHello(){
        for (int i = 0; i < 2; i++)
        System.out.println("Hello");
    }
}