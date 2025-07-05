package classday5;

public class Example2 {
    public static void main(String[] args) {
        try{
            try {
                int res=10/0;
                System.out.println(res);
            } catch (NullPointerException e) {
                System.out.println("THis is error due to: "+e.getMessage());
                // TODO: handle exception
            }

            String result=null;
            System.out.println(result.toLowerCase());

            try {
                int arr[]={1,2,2};
                System.out.println(arr[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This error is due to: "+e.getMessage());
            }
        }catch(Exception e){
            System.out.println("bahira exception handling");
        }
        System.out.println("ALISHAAAAAAAAAAAAAA");
    }
}
