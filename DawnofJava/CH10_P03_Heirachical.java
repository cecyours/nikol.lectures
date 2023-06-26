public class CH10_P03_Heirachical {
    public static void main(String[] args) {
        
        new B();
        System.out.println("----------");
        new D();
        System.out.println("----------");
        new E();
    }
}

// A -> B
// A -> C
// C -> D
// C -> E


class A{

    public A()
    {
        System.out.println("I'am class A "+this);
    }
}


class B extends A{

    public B()
    {
        System.out.println("I'am class B "+this);
    }
}

class C extends A{

    public C()
    {
        System.out.println("I'am class C "+this);
    }
}

class D extends C{

    public D()
    {
        System.out.println("I'am class D "+this);
    }
}

class  E extends C{

    public E()
    {
        System.out.println("I'am class E "+this);
    }
}
