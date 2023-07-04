import java.util.Scanner;
public class MyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст");
        int myAge = sc.nextInt();
        int votingAge = 18;
        if ( myAge >= votingAge){
            System.out.println("Вы можете проголосовать");
        } else {
            System.out.println("Это не возможно");
        }

    }

    }
