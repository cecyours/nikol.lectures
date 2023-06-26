public class CH10_P02_Multilevel {
    public static void main(String[] args) {

        new C();
    }
}

// A -> B -> C

class A {

    public A() {
        System.out.println("I'am class A " + this);
    }
}

class B extends A {

    public B() {
        System.out.println("I'am class B " + this);
    }
}

class C extends B{

    public C() {
        System.out.println("I'am class C " + this);
    }
}
