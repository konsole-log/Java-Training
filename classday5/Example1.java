package classday5;

public class Example1 {
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3};
            System.out.println(arr[3]);

            int res=10/0;
            System.out.println("res"+res);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        String res=null;
        String res = "null";
        System.out.println("Alisha");
    }
    
}
