import java.util.*;
import java.io.*;

public class CH15_P07_HashMap {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> list = new HashMap<>();

        list.put("Sneha", 99);
        list.put("Shalini", 91);
        list.put("Shivu", 92);


        System.out.print("Enter the student name : ");
        String sName = br.readLine();


        if(list.containsKey(sName))
        {
            System.out.println("your marks is "+list.get(sName));
        }
        else
        {
            System.out.println("Student not found...");
        }

        for(Map.Entry<String,Integer> student: list.entrySet())
        {
            System.err.println("welcome "+student.getKey()+"\t "+student.getValue());
        }
        
        Collection<Integer> ms = list.values();

        for(Integer n : ms)
        {
            System.out.println("your marks "+n  );
        }
    }   
}
