public class CH07_P02_method_structure {
    public static void main(String[] args) {

        Method m = new Method();
        m.display("sneha");
    }
}

class Method {

    boolean display(String username) // prototype
    {
        // method body
        System.out.println("Welcome " + username);

        return true; // return statement
    }
}
