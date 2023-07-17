import java.util.Iterator;
import java.util.Stack;

public class CH15_P06_Stack {
    public static void main(String[] args) {
        
        Stack s = new Stack<Integer>();

        s.push(12);
        s.push(15);
        s.push(18);
        s.push(11);
        s.push(8);


        System.out.println("current : "+s.peek());

        s.pop(); // remove 8
        System.out.println("new current : "+s.pop());

        s.push(100);


        Iterator it = s.iterator();

        while(it.hasNext())
        {
            System.out.println(" rollno : "+it.next());
        }

    }
}
