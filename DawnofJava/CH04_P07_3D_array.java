import java.io.*;
/**
 * CH04_P07_3D_array
 */
public class CH04_P07_3D_array {

    public static void main(String[] args) throws Exception {
        
        int i,j,k,t,r,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        System.out.print("Enter table number : ");
        t = Integer.parseInt(br.readLine());

        System.out.print("Enter row number : ");
        r = Integer.parseInt(br.readLine());
        
        System.out.print("Enter column number : ");
        c = Integer.parseInt(br.readLine());
        
        int a[][][] = new int[t][r][c];
        int counter=0;
        // creating 3D array
        for(i=0;i<t;i++) // table
        {
            for(j=0;j<r;j++) // row
            {
                for(k=0;k<c;k++) //columns
                {
                    // assign values
                    // a[i][j][k]  = ++counter;
                    a[i][j][k] = (int)(Math.random()*10)+10;
                }
            }
        }

        // display 3D array
        for(i=0;i<t;i++) // table
        {
            for(j=0;j<r;j++) // row
            {
                for(k=0;k<c;k++) //columns
                {
                    // display element values
                    System.out.printf("%3d ",a[i][j][k]);
                }
                System.out.println();
            }
            System.out.println(" ------- - -- ");

        }

        

    }
}

/*
 * {
 *      {//t0
 *  
 *          1, 2, 4
 *          6, 8, 9 //
 *          1, 7, 8
 *       },
 * 
 *      { // t1
 *          8, 5
 *          7, 1
 *      }
 * }
 * 
  */