//class name should be same as file name

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("hello world");//to give output in new line

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number one:");
        int a=scan.nextInt();
        System.out.println("Enter number two: ");
        int b=scan.nextInt();
        int sum=a+b;
        System.out.println("Sum of two number is: "+sum);
    }

}