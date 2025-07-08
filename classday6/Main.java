import java.util.Scanner;

class IsNotCharacter extends Exception{
    IsNotCharacter(String msg){
        super(msg);
    }
}
class IsNotNumber extends Exception{
    IsNotNumber(String msg){
        super(msg);
    }
}


class Info{
    
    private String fname,lname,fullName,age;

    Info(String fname,String lname,String age){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        fullName=fname+" "+lname;
    }
    public void validateName() throws IsNotCharacter{
        char fullname[]=fullName.toCharArray();
        //can also use regex
        for (char s: fullname) {
            if(((s<='a'&& s>='z')||(s<='A'&&s>='Z'))&&!(s>='0'&&s<='9')){
                throw new IsNotCharacter("there is no character so it is error");
            }
        }
        System.out.println("Name: "+fullName);
    }
    public void validateAge() throws IsNotNumber{
        char ageArray[]=age.toCharArray();
        // can use parse to int method too
        for(char a: ageArray){
            if((a>='0'&&a<='9')&&age.length()>=100){
                throw new IsNotNumber("Given age is not number");
            }
        }
        // if(!Integer.parseInt(age)){
        //     throw new IsNotNumber("Age is not number");
        // }

        System.out.println("Age: "+ age);

    }
    public void printInfo(){
        try{
            validateName();
        }catch(IsNotCharacter s){
            System.out.println(s.getMessage());
        }
        try{
            validateAge();
        }catch(IsNotNumber n){
            System.out.println(n.getMessage());
        }
        
        
    } 
}


public class Main {
    public static void main(String[] args) {
        String fname,lname,age;
        
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your firstname: ");
        fname=scan.nextLine();
        System.out.println("Enter your lastname: ");
        lname=scan.nextLine();
        System.out.println("Enter your age: ");
        age=scan.nextLine();

        Info user = new Info(fname,lname,age);
        user.printInfo();
    }
}
