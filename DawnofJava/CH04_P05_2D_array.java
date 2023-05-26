

/**
 * CH04_P05_2D_array
 */
public class CH04_P05_2D_array {

    public static void main(String[] args) {
        
        int a[][] = 
                    {
                            {1,2,3,6},
                            {3,4,5},
                            {},
                            {4,9,6,3,6,7}
                    };
        
        // System.out.println(a[2][1]);
        // using loop
        for(int i=0;i<a.length;i++) //row
        {
            for(int j=0;j<a[i].length;j++) // columns
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println(); //change the row..
        }
    }
}