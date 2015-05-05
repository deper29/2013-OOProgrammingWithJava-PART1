
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        // print empty line
        System.out.println("");
        double circ = Math.PI * 2 * radius;
        System.out.println("Circumference of circle: " + circ);
    }
}
