public class CH08_P01_Inheritance {
    public static void main(String[] args) {

        B b = new B();

        b.display();
    }
}

//  A -> B

class A {

    void display() {
        System.out.println("Hello Coder " + this);
    }
}

class B extends A {

    void display() {
        super.display();
        System.out.println("Hello Programmer " + this);
    }
}