# CLASS DAY-1(6/24):
* class name should be same as the file name
* entry point always start as public static void main(String[] args){}
> Access Modifier:
> - public:
> - static: this makes method run without creating an object
> - main(): this is the name of method
>
### Simple program
```java
public class Main{
    public static void main(String[] args){
        System.out.println("hello world);
    }
}
```
We should use word `import` keyword to import java library<br>
### Simple use of `import` keyword to import `java.util.Scanner` for scanner class
```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number one:");
        int a=scan.nextInt();
        System.out.println("Enter number two: ");
        int b=scan.nextInt();
        int sum=a+b;
        System.out.println("Sum of two number is: "+sum);
    }

}
```
* To create new object we can use `new` keyword
* Syntax: `ClassName <object_name> = new ClassName(params)`
* In code segment `Scanner scan = new Scanner(System.in)` it is making object for Scanner class
> ### Tasks:
> 1. to check if given input is even or odd
> 2. to print from 1 to 10
> 3. to find factorial of number using while loop


# CLASS DAY-2(6/26):
* about OOP in JAVA
* about attributes and other things like method and instances
* learned about constructor
  * parameterised constructor
  * non-parameterised constructor
> Constructors are further discussed below:
