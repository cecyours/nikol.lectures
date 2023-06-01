
/**
 * CH02_P06_ScannerBug
 */
import java.util.*;
public class CH02_P06_ScannerBug {

 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    Student s = new Student();
    

    System.out.print("Enter rollno : ");
    s.studentRollNo = sc.nextInt();

    System.out.print("Enter name : ");
    s.studentName = sc.nextLine(); // for String

    System.out.print("Enter subejct name : ");
    s.subjectName = sc.nextLine();


    System.out.print("Enter subject marks : ");
    s.subjectMarks = sc.nextDouble();
    

    s.display();

 }   
}

class Student{

    int studentRollNo;
    String studentName;
    String subjectName;
    double subjectMarks;


    void display()
    {

        System.out.print("studentRollNO : "+studentRollNo);
        System.out.print("  studentName : "+studentName);
        System.out.print("  subjectName : "+subjectName);
        System.out.print(" subjectMarks : "+subjectMarks);
    }
}