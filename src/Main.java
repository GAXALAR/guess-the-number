import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("try to guess the number!");
        int range = 100;
        int number = (int)(Math.random()*range);
        while(true){
            System.out.println ("guess number from 0 to " + range);
            int input_number = scanner.nextInt();
            if(input_number == number){
                System.out.println("congrats!");
                break;
            } else if (input_number > number){
                System.out.println ("your number is bigger");
            } else {
                System.out.println("your number is less");
            }
        }
        scanner.close();
    }
}