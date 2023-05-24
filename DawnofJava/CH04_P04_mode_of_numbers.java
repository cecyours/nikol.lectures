import java.io.*;
/**
 * CH04_P04_mode_of numbers
 */
public class CH04_P04_mode_of_numbers {

    
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
            System.out.print(" "+a[i]);
        }
        System.out.println();


        // max indexing...
        int max_indexing[] = new int[n];
        int counter = 0;
        
        for(i=0;i<n;i++)
        {
            counter = 0;
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j])
                    counter++;
            }
            max_indexing[i] = counter;

        }

        // display n elements to the user.
        for(i=0;i<n;i++)
        {
            System.out.print(" "+max_indexing[i]);
        }
        System.out.println();

        // max index
        int max_index = 0;
        int max_number = max_indexing[0];
        for(i=0;i<n;i++)
        {
            if(max_number<max_indexing[i])
            {
                max_number= max_indexing[i];
                max_index = i;
            }
        }

        System.out.println("your max number : "+a[max_index]);
    }
}

