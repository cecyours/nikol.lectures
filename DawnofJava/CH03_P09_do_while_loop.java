
/**
 * CH03_P09_do_while_loop
 */
public class CH03_P09_do_while_loop {

    public static void main(String[] args) {
        
        // Entry loop : check condition in starting. 
        // Exit loop : check condition after finishing the loop

        int n=1230;

        // while(n<10)
        // {
            // System.out.println("line "+n++);
        // }

        do{
            System.out.println("line "+n++);    
        }while(n<10);
    }
}