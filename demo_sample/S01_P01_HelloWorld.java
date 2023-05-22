import java.io.BufferedReader;
import java.util.Scanner;

/**
 * S01_P01_HelloWorld
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println("Hello World..");

        new Student();
        Student s = new Student(8,"new");

    }
}

interface Coder{
   public void display();
}

class Student implements Coder{

    // constructors....
    // default
    // TODO : i am fine.
    // FIXME : not working...

    public Student()
    {
        System.out.println("Hello There..."+this);
    }

    public Student(int i)
    {
        System.out.println("Hello 1..."+this);
    }

    public Student(String name)
    {
        System.out.println("Hello 2..."+this);
    }

    public Student(int i,String name)
    {
        System.out.println("Hello 3..."+this);
    }

   public void display()
    {
        // TODO : Do something...
    }

}