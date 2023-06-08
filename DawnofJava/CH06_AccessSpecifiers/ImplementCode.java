import school.Student;
import school.Teacher;

public class ImplementCode {
    
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        System.out.println("public : "+s.public_uname+", "+t.public_uname);
        //System.out.println("private : "+s.private_uname+", "+t.private_uname);
        
        System.out.println("protected : "+", "+t.studentName());
        System.out.println("default : "+s.uname+", "+t.studentName());

        
    }
}
