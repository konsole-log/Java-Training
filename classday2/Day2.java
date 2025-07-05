package classday2;

class Student{
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
public class Day2{
    public static void main(String[] args) {
        Student s=new Student();
    }
}