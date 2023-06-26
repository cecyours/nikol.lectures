public class CH10_P01_type_casting {
 public static void main(String[] args) {
    
        // widening : implicit(automatic) type cast
        // small -> large

        int i=10;
        float f = i;

        System.out.println("   int : "+i);
        System.out.println(" float : "+f);


        // narrowing : explicit(manual) type cast
        // large to small
        f = 9.29f;
        i = (int)f;
 
        System.out.println(" float : "+f);
        System.out.println("   int : "+i);

 
    }   

}
