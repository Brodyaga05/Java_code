public class Main {
    public static void main(String[] args) {
      /*int[] numbers = new int[5];
      numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);*/
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";
        for(int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string:strings){
            System.out.println(string);
        }








    }

}