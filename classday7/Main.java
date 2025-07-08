package classday7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> slist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of student you want to add: ");
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("For student "+i);
            System.out.println("Enter the roll no of Studeent: ");
            int roll=scan.nextInt();
            System.out.println("Enter the name of the student: ");
            String name=scan.next();
            Student s=new Student(roll,name);
            slist.add(s);
            System.out.println("------------------------");
        }
        
        System.out.println("Student info:");
        for(Student s: slist){
            System.out.println(s.toString());
            
        }

    }
}
