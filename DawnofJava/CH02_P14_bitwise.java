
/**
 * CH02_P14_bitwise
 */
public class CH02_P14_bitwise {

    public static void main(String[] args) {
        
        int a = 7,b = 4;
        int c;

        /**
         * bitwise AND : gives 1 if all are 1.
         *         8 4 2 1
         * ---------------------- 
         * a [7] : 0 1 1 1 
         * b [4] : 0 1 0 0
         * -------------------
         *     & : 0 1 0 0 => 4
         */
        c = a&b;
        System.out.println(a+" & "+b+" = "+c);

        /**
         * BitWise OR : gives 1 if any of them is 1 
         * *       8 4 2 1
         * ---------------------- 
         * a [7] : 0 1 1 1 
         * b [4] : 0 1 0 0
         * -------------------
         *     | : 0 1 1 1 => 7 
         */
        c = a|b;
        System.out.println(a+" | "+b+" = "+c);

        /**
         * Bitwise nagation ~
         *  
         *  c = ~(a)
         *    = -(a+1)
         *    = -(7+1)
         *    = - 8   
         */

         c =~a;
         System.out.println("~ "+a+" = "+c);

            /**
             * left shift..
             * 
             *  c = a*2^b
             *    = 7*2^4
             *    = 7*16
             *    = 112
             * 
              */
              c  = a<<b;
              System.out.println(a+" << "+b+" = "+(c));
        

              a = 16;
              b = 2;
            /**
             * right shift..
             *  c = a/2^b
             *    = 16/2^2
             *    = 16/4
             *    = 4
             * 
              */
              c  = a>>b;
              System.out.println(a+" >> "+b+" = "+(c));
            }
}