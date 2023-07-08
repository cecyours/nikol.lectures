import java.io.*;
public class CH13_P03_multipleException {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size : ");
        int n = Integer.parseInt(br.readLine());

        int a[] = new int[n];
        int i;
        System.out.println("Enter all elements : ");
        
        int sum =0;
        for(i=0;i<n;i++)
        {
            System.out.print("a [ "+i+" ] = ");
            a[i] = Integer.parseInt(br.readLine());
            sum+=a[i];
            
        }
        
        System.out.print("Enter your lucky index : ");
        int index = Integer.parseInt(br.readLine());
        
        
        int min = a[0];
        for(i=0;i<n;i++)
        {
            // find min
            if(a[i]<min)
                min = a[i];
        }

        int ans=0;

        try{
            ans = (sum+a[index])/min;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(" IndexOutOfBoundsException ");
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException ");
        }
        catch(Exception e)
        {   
            System.out.println("Exception");
        }   
        finally{
            System.out.println("i am error...");
        }
        System.out.println("ans "+ans);

        
    }   
}   
