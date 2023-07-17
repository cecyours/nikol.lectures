import java.util.*;


public class CH15_P05_LinkedHashSet {
    
    public static void main(String[] args) {
        

        LinkedHashSet <String>ls = new LinkedHashSet<>(5);

        ls.add("Suresh");        
        ls.add("Mohan");
        ls.add("Ramesh");
        ls.add("Kites");     
        ls.add("Neha");


        // 
        ls.remove("Kites");
    
        // for(String x:ls)
        // {
        //     System.out.println("Hello "+x);
        // }

        Iterator it = ls.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    
}

