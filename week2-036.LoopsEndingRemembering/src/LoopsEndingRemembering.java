import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        int count, input, sum, even;
        double average;
        Scanner reader = new Scanner(System.in);
        input = 0;
        count = sum = even = 0;
        average = 0;
        
        System.out.println("Type numbers:");
        while(input != -1){
            input = Integer.parseInt(reader.nextLine());
            if (input != -1){
                sum += input;
                count += 1;
                if ( input % 2 == 0){
                    even += 1;
                }
            }
        }
        average = (double) sum / count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (count - even));

    }
}
