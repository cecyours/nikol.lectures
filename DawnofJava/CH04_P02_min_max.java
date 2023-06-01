import java.io.*;

/**
 * CH04_P02_min_max
 */
public class CH04_P02_min_max {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of array : ");
        int n = Integer.parseInt(br.readLine());
        
        int a[] = new int[n];  // allocate n integers to the 'a[]'
        
        System.out.println("Enter the elements : ");
        int i;

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

        // 0,1,2,3,4,5,6,7,8,9

        int max = 0;
        int min = 0;

        max = min = a[0];

        for(i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }   
            else if(min>a[i])
            {
                min = a[i];
            }
        }

        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}

/**
 * 
 * find +ve, -ve or zero numbers present in the given array..
  */