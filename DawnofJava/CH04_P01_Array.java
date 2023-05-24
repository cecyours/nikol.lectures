
/**
 * CH04_P01_Array
 */
public class CH04_P01_Array {

    public static void main(String[] args) {
        
        int a[] = {10,20,30,40,50,60,70,80,90,100};

        // System.out.println(a[3]);
        // iterate all elements of loop
        // using for loop

        for(int i=0;i<a.length;i++)
        {
            System.out.println(" a[ "+i+" ] = "+a[i]);
        }

        // using for-each
        int x=0;
        for(int n:a)
        {
            System.out.println((x++)+" number : "+n);
        }
    }
}