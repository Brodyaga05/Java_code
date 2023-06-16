import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Вы родился");
                break;
            case 7:
                System.out.println("Ты пошел в садик");
                break;
            case 18:
                System.out.println("Вы пошел работать");
                break;
            default:
                System.out.println("Ты не ты");

        }


    }

}