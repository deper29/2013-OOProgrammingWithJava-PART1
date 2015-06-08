import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        random = new Random();
        this.length = length;
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        int i = 0;
        while(i < this.length){
            password += alphabet.charAt(random.nextInt(26));
            i++;
        }
        return password;
    }
}
