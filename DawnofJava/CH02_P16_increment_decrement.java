
/**
 * CH02_P16_increment_decrement
 */
public class CH02_P16_increment_decrement {

    public static void main(String[] args) {
        
        int i = 10;
        // increment +1

        /**
         *  1. post increment x++ : access the value first then increment.
         *  2. pre increment ++x : increment then, access the value
         * 
          */

          System.out.println("during post increment : "+(i++)); //post increment : 10 
          System.out.println(" after post increment : "+(i)); // effect 11

          System.out.println(" during pre increment : "+(++i)); // 12
          System.out.println("  after pre increment : "+(i)); // 12
          

        System.out.println("----------------------------");

        /**
         *  1. post decrement x-- : access the value first then decrement.
         *  2. pre decrement --x: decrement then, access the value
         * 
          */

          System.out.println("during post decrement : "+(i--)); //post decrement : 12
          System.out.println(" after post decrement : "+(i)); // effect 11

          System.out.println(" during pre decrement : "+(--i)); // 10
          System.out.println("  after pre decrement : "+(i)); // 10
          
          
    }
}