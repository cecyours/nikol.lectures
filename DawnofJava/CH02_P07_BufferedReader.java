/**
 * CH02_P07_BufferedReader
 */
import java.io.*;
public class CH02_P07_BufferedReader {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Student s = new Student();
    
        System.out.print("Enter the rollno : ");
        s.studentRollNo = Integer.parseInt(br.readLine());

        System.out.print("Enter the name : ");
        s.studentName = br.readLine();

        System.out.print("Enter the subject : ");
        s.subjectName = br.readLine();

        System.out.print("Enter the mark");
        s.subjectMarks = Double.parseDouble(br.readLine());

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