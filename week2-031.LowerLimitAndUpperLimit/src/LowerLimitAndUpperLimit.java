
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int first, last;
        System.out.print("First: ");
        first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        last = Integer.parseInt(reader.nextLine());
        
        int i = first;
        while (i <= last){
            System.out.println(i);
            i++;
        }

    }
}
