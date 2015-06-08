
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        NumberStatistics numStats = new NumberStatistics();
        NumberStatistics evens = new NumberStatistics();
        NumberStatistics odds = new NumberStatistics();
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        System.out.println("Type numbers:");
        while (true) {
            i = Integer.parseInt(reader.nextLine());
            if (i == -1) {
                break;
            }
            numStats.addNumber(i);
            if (i % 2 == 0) {
                evens.addNumber(i);
            } else {
                odds.addNumber(i);
            }
        }

        System.out.println("sum: " + numStats.sum());
        System.out.println("sum of even: " + evens.sum());
        System.out.println("sum of odds: " + odds.sum());

    }
}
