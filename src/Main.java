import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

        public static void main (String[]args){

        System.out.println("try to guess the number!");
        int range = 100;
        int number = (int) (Math.random() * range);
        playlevel1 (range, number);

        scanner.close();
    }
        private static void playlevel1 ( int range, int number){
        while (true) {
            System.out.println("guess the number from 0 to " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("congrats!");
                break;
            } else if (input_number > number) {
                System.out.println("your number is bigger");
            } else {
                System.out.println("your number is less");
            }
        }
    }

}