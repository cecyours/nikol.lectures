public class CH07_P10_Annonymous {
    public static void main(String[] args) {

        Student s = new Student() {
            public void display() {
                System.out.println("my name is khan");
            }

        };

        s.display();

        Student h = new Student() {
            public void display() {
                System.out.println("my name is you");
            }
        };

        h.display();

    }
}

abstract class Student {
    abstract public void display();
}

// A : confi
// A(abstract c)-B(c) ;