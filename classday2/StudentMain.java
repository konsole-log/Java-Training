package classday2;

import java.util.Scanner;

class Student{
    private String firstname;
    private String lastname;
    public void setFirstName(String firstname){
        this.firstname=firstname;
    }
    public void setLastName(String lastname){
        this.lastname=lastname;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void getFullName(){
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1,firstname.length());
        lastname=lastname.substring(0,1).toLowerCase()+lastname.substring(1,lastname.length());
        String fullname=firstname+" "+lastname;
        System.out.println("Full name: "+fullname);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fname=scan.nextLine();
        System.out.println("Enter your last name: ");
        String lname=scan.nextLine();

        Student s=new Student();
        s.setFirstName(fname);
        s.setLastName(lname);
        s.getFullName();

    }
}
