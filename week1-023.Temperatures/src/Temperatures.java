
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
        double value;
        while (true) {
            System.out.print("Please enter a temperature: ");
            value = (double) Integer.parseInt(reader.nextLine());
            if (value >= -30 && value <= 40 ){
                Graph.addNumber(value);
            }
            
        }
    }
}