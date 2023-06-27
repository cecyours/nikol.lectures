public class CH11_P03_MultipleInheritance {
    public static void main(String[] args) {
            C c = new C();
            c.display();
            c.print();
            c.show();
    }
}


interface A {

    void display();
    void show();
}

interface B{
    void display();
    void print();
}

class C implements A,B{

    @Override
    public void print() {
        
        System.out.println("I am print");
    }
    @Override
    public void display() { 
        System.out.println("I am display");
        
    }
    @Override
    public void show() {
        System.out.println("I am show");
    }
    // 2,3,4
}