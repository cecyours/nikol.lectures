public class CH10_P02_GeneralizationSpecialization {
    public static void main(String[] args) {

        // small to large
        A a1 = (A)new B();
        a1.displayA();

        A a = (A)new B();
        B b = (B)a;

        b.displayB();
        
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
