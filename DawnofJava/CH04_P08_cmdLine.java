import java.io.*;
/**
 * CH04_P08_cmdLine
 */
public class CH04_P08_cmdLine {

    public static void main(String[] args) throws Exception {
        
        int max=0;
        int index =0;
        int i;
        boolean isData = false;
        for(i=0;i<args.length;i++)
        {
            isData = true;
            if(args[i].length()>max)
            {
                index = i;
                max = args[i].length();
            }
        }
        if(isData)
        System.out.println("new : "+args[index]);
    }
}