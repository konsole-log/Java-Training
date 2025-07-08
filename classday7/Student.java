package classday7;

public class Student {

    private String fullname;
    private int rollno;

    Student(int rollno, String fullname) {
        this.rollno = rollno;
        this.fullname = fullname;
    }

//    public void printInfo() {
//        System.out.println("Name: " + fullname);
//        System.out.println("RollNO: " + rollno);
//    }

    @Override
    public String toString() {
        return "Student{" + "fullname=" + fullname + ", rollno=" + rollno + '}';
    }
    
    
}

