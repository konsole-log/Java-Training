package classday2;
class Shape {
    public static int areaOfRect(int l,int b){
        return l*b;
    }
    public static double areaOfTriangle(int b,int h){
        return (0.5*b*h);
    }
    public static int areaOfSquare(int l){
        return l*l;
    }
    public static int perimeterOfRect(int l,int b){
        return 2*(l+b);
    }
}
public class MainShape{
    public static void main(String[] args) {
        System.out.println("Area of Rect:"+Shape.areaOfRect(20, 3));
        System.out.println("Area of Triangle:"+Shape.areaOfTriangle(2, 3));
        System.out.println("Area of square: "+Shape.areaOfSquare(4));
        System.out.println("Perimeter of Rectangle: "+Shape.perimeterOfRect(20, 30));
    }
}
