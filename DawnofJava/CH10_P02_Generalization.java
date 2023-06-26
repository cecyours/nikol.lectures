public class CH10_P02_Generalization {
    public static void main(String[] args) {

        // small to large
        A a = (A)new B();
        a.displayA();
        
    }
}

class A{
    void displayA()
    {
        System.out.println("I am A "+this);
    }
}

class B extends A{
    void displayB()
    {
        System.out.println("I am B "+this);
    }
}
