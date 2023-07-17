import java.util.HashSet;
import java.util.Spliterator;

public class CH15_P03_Set {
    
    public static void main(String[] args) {
        
        HashSet <String>s = new HashSet<>();

        s.add("Riya");       
        s.add("Sneha");
        s.add("rahul");     
        s.add("rahul");
        s.add("rahul");

        s.remove("Riya");

        for(String i:s)
        {
            System.out.println(i);
        }

        System.out.println("---------------");
        Spliterator kie = s.spliterator();

        kie.forEachRemaining(System.out::println);
    }
}
