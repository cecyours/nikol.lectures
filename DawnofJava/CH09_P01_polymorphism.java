public class CH09_P01_polymorphism {
    public static void main(String[] args) {

        Task t = new Task();

        t.greeting();
        t.greeting("After Noon","Sneha");
        t.greeting("Sneha");
    }
}

// Method over loading.
// different signature
// same class
class Task{

    void greeting()
    {
        System.out.println("Good After noon");
    }

    void greeting(String user)
    {
        System.out.println("Good after noon, "+user);
    }

    void greeting(String wish,String user)
    {
        System.out.println("GOod "+wish+", "+user);
    }
}