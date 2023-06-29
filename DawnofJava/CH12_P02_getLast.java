import CH12_pkg.*;
public class CH12_P02_getLast {
    public static void main(String[] args) {
        
        CH12_P01_DigitCode c = new CH12_P01_DigitCode();

        int x = c.getLast(129);
        System.out.println("last digit : "+x);

        CH12_P03_Bank b = new CH12_P03_Bank();

        b.withdrawBalance(10000);
    }
}
