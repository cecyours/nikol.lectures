public class CH07_P03_methods_type {
    public static void main(String[] args) {

        Student s = new Student();

        // non-static
        s.display(); // with object


        // static
        Student.print(); // with class
        s.print(); // without class
    }
}

class Student {

    void display() // non-static method = instance method
    {
        /* 
         *  which must required an object to access it.
         * Student s = new Student();
         * s.display();
         * 
         * 
         */
        System.out.println("welcome instanse : " + this);
    }

    static void print() // static
    {
        /* 
         * which can called by an object or a class
         * Student.print(); // with class name
         * s.print(); // with object
         *  
         *  ## shared memory
         */
        System.out.println("I am static with ");
    }
}
