
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        if (points <= 29){
            System.out.println("Grade: Failed");
        } else if(30 <= points && points <= 34){
            System.out.println("Grade: 1");
        } else if(35 <= points && points <= 39){
            System.out.println("Grade: 2");
        } else if(40 <= points && points <= 44){
            System.out.println("Grade: 3");
        } else if(45 <= points && points <= 49){
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }

    }
}
