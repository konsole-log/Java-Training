public class FinallyBlock{
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Finally block executed");
        }
    }
}