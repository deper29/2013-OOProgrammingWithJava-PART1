
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("Sum is " + ((n)*(n + 1)/2));

    }
}
