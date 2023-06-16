import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        String age = scanner.nextLine();
        switch (age){
            case "нуль":
                System.out.println("Вы родился");
                break;
            case "пять":
                System.out.println("Ты пошел в садик");
                break;
            case "восемнадцать":
                System.out.println("Вы пошел работать");
                break;
            default:
                System.out.println("Ты не ты");

        }


    }

}