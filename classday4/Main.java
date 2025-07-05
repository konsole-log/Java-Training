package classday4;

public class Main {
    public static void main(String[] args) {
        
        Bank b=new SBI();
        Bank c=new NIC();
        System.out.println("Interst in SBI: "+b.calculateInterest(1000));
        System.out.println("Interest in NIC: "+c.calculateInterest(90000));
    }
}
