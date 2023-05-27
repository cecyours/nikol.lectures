import java.io.*;
/**
 * CH04_P06_user_2d_array
 */
public class CH04_P06_user_2d_array {

    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n,//rows
        m;//columns

        System.out.print("Enter the row : ");
        n = Integer.parseInt(br.readLine());

        System.out.println("Enter matrix ...");

        int a[][] = new int[n][];
        int i,j;
        for(i=0;i<n;i++)// rows
        {


            System.out.print("Enter the column : ");
            m = Integer.parseInt(br.readLine());

             a[i] = new int[m]; //
            
             for(j=0;j<m;j++)//columns
            {
                System.out.print("Enter valye for a [ "+i+" ][ "+j+" ] : ");
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }


        // display
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();

        }
    }
}