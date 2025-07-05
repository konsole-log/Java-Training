package classday5;
//exception handling
public class Main {
    public static void main(String[] args) {
        try {
            String res=null;
            System.out.println("res: "+ res.toLowerCase());

            int result =10/0;
            System.out.println("result "+ result);

            int arr[]={1,2,3};
            System.out.println(arr[3]);
        } catch (NullPointerException e) {
            System.out.println("null"+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("error: "+e.getMessage());;
        }catch(Exception e){
            System.out.println("Hello");
        }
        System.out.println("Exception handle");
    }
}