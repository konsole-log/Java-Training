import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int x=scan.nextInt();
        int i=1;
        int f=1;
        while(i<=x){
            f*=i;
            i++;
        }
        System.out.println("Factorial of the given number is: "+f);
    }
}
