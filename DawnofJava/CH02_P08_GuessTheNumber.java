//  html code -> ajax(data) -> python -> interpret ->out(HTTP RESPONSE) -> ajax(response)
/**
 * CH02_P08_GuessTheNumber
 */
import java.io.*;
public class CH02_P08_GuessTheNumber {

    public static void main(String[] args) throws Exception{
        
        double d = Math.random()*10;
        int i = (int)(d);
        System.out.println(i);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num;
        // do
        // {
        //     System.out.print(i+ " Enter the number : ");
        //     num = Integer.parseInt(br.readLine());
        // }
        // while(num!=i);
        // System.out.print("Hello Winner.."+i+" \t num : "+num);
        
        boolean f = false;
        for(int x=0;x<3;x++)
        {
            
            System.out.print(i+ " Enter the number : ");
            num = Integer.parseInt(br.readLine());

            if(i==num)
            {
                System.out.print("Hello Winner.."+i+" \t num : "+num);
                f = true;
            }   
         
        }

        if(!f)
        {
            System.out.print("your trials are over...");
        }

    }
}

//  0.36
// x = 4.35
