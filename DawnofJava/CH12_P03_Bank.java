package CH12_pkg;

public class CH12_P03_Bank {
    
    static int balance = 9000;

    public void withdrawBalance(int amount)
    {
            if(balance-amount<0)
            {
                System.out.println("not enough balance..");
            }
            else{
                balance -= amount;
                System.out.println(amount+" is credited..");
            }
    }
}
