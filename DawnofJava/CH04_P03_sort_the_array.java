import java.io.*;

/**
 * CH04_P03_sort_the_array
 */
public class CH04_P03_sort_the_array {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of array : ");
        int n = Integer.parseInt(br.readLine());
        
        int a[] = new int[n];  // allocate n integers to the 'a[]'
        
        System.out.println("Enter the elements : ");
        int i,j;

        // get n elements from user.
        for(i=0;i<n;i++)
        {
            System.out.print(" a [ "+i+" ] = ");
            a[i] = Integer.parseInt(br.readLine());
        }

        // display n elements to the user.
        for(i=0;i<n;i++)
        {
            System.out.println(" a[ "+i+" ] = "+a[i]);
        }

        // sort the array
        // 2,4,2,5,5,6,2,6

        int temp; // balti...
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                if(a[i]>a[j])
                {
                    // swap the numbers..
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                
            }

        }

               // display n elements to the user.
               System.out.println("sorted....");
               for(i=0;i<n;i++)
               {
                   System.out.println(" a[ "+i+" ] = "+a[i]);
               }
       
    }
}