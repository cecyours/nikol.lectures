public class CH09_P02_run_time_overriding {
    public static void main(String[] args) {
            
        A b = new B();

        b.display();
    }
}


// Method overriding.
// same signature
// different class (inheritance must be)

class A{

     static void display()
    {
        System.out.println("class A ");
    }
}
class B extends A{
    
    
    // @Override
    static void display()
     {
        // super.display();
        System.out.println("class B ");
    }
}

