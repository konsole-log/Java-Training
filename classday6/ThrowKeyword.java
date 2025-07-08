public class ThrowKeyword {
    public static void validateAge(int age) throws Exception{
        if(age<=18){
            //==> compile time exception: throw new IllegalArgumentException("Age is not valid");//exception created
            throw new  Exception("Age is not valid");//compile time exception
        }
        System.out.println("age is valid");
    }
    
    public static void main(String[] args) {
        try{
            validateAge(1);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}
