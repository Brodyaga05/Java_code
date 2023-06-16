import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        if (age==10){
            System.out.println("Вы учитесь в школе");}
            else if (age==18){
                System.out.println("Вы закончили школу");
            }
            else if (age==25){
                System.out.println("Вы работаете");
            }




    }

}