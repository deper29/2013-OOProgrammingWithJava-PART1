
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name;
        String studentNumber;
        Student student;

        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            
            // end loop condition
            if (name.equals("")){
                break;
            }
            
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            
            // create student and add to list
            student = new Student(name, studentNumber);
            list.add(student);
        }
        
        //System.out.println("result");
        for(Student s : list){
            System.out.println(s);
        }
        System.out.println("");
        // implement the search term functionality
        String st;
        System.out.print("Give the search term: ");
        st = reader.nextLine();
        System.out.println("Result:");
        for (Student e : list){
            if (e.getName().contains(st)){
                System.out.println(e);
            }
        }
    }
}
