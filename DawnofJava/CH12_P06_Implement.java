import CH12_pkg.*;
public class CH12_P06_Implement implements CH12_P05_MyInterface {
    
    @Override 
    public void display()
    {
        System.out.println("Hello There...");
    }
    public static void main(String[] args) {

        CH12_P06_Implement s = new CH12_P06_Implement();
        s.display();
    }
}
