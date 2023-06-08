public class CH06_P04_Inheritance {
    
    public static void main(String[] args) {
        B b = new B();

        b.display(); // B
        new A().display(); // A

    }
}


// A -> B

class A{

    public void display()
    {
        System.out.println("Hello Me "+this);
    }
}

class B extends A{

    public void display() // B
    {
        System.out.println("Hello Sneha "+this);
    }
}