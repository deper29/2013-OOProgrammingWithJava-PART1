public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times  
        int i;
        i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i;
        i = 0;
        while (i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int level;
        level = 1;
        while(level <= size){
            printWhitespaces(size - level);
            printStars(level);
            level++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int level;
        level = 1;
        while (level <= height){
            printWhitespaces(height - level);
            printStars(2*(level-1) + 1);
            level++;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
