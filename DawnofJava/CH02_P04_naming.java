
// packages : small letters
import java.util.*;
/**
 * CH02_P04_naming
 */
// class Name : All initals Capitals
public class CH02_P04_naming {

    public static void main(String[] args) {
        // objectName : camelcase
        Student studentSneha = new Student();

        studentSneha.setData(10, "Sneha");
        studentSneha.display();
    }
    
}

// class Name : All initals Caps.
class Student{

    // variables : camelcase
    int studentRollNo;
    String studentName;

    // methods : camelcase()
    void setData(int x, String y)
    {
        studentRollNo = x;
        studentName = y;
    }

    void display()
    {
        System.out.println("rollno : "+studentRollNo+"\t Name : "+studentName);
    }
}