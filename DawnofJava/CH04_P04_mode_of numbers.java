
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
            System.out.println(" a[ "+i+" ] = "+a[i]);
        }

    }
}