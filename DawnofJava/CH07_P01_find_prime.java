import java.util.ArrayList;

import java.io.*;

public class CH07_P01_find_prime {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter start number : ");
        int start = Integer.parseInt(br.readLine());

        System.out.print("Enter end number : ");
        int end = Integer.parseInt(br.readLine());

        Task t = new Task(start, end);

        ArrayList<Integer> aList = t.generateList();

        for(int a: aList)
        {
            System.out.println(" line : "+a);
        }
    }
}

class Task{

    private int start,end,number;
    private ArrayList<Integer> a;
    
    public Task(){

    }
    public Task(int start,int end)
    {
        this.start = start;
        this.end = end;
        a = new ArrayList<>();
    }

    
    public boolean isPrime(int number)
    {
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
                return false;
        }
        return true;
    }

    public ArrayList<Integer> generateList()
    {
        for(int i=this.start;i<=this.end;i++)
        {
            this.number = i;
            
            if(isPrime(i))
                a.add(i); // append 'i' into arraylist.
        }

        return a;
    }
}
