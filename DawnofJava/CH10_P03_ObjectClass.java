

public class CH10_P03_ObjectClass {
    public static void main(String[] args) throws Exception {
        
            Student s1 = new Student(19, "Sneha");
            Student s2 = new Student(19, "Sneha");  

            Student s3 = (Student)s1.clone();
            s1.studentName = "neha";
            if(s1.equals(s2))
            {
                System.out.println("Both student are same "+s1);
            }
            else{
                System.out.println("Both student are diff "+s1+", "+s2);
            }

            System.out.println("i am "+s3);
    }
}

class Student {

     int rollNo;
     String studentName;

    // @ConstructorProperties
    public Student(int rollNo,String studentName)
    {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "rollno : "+this.rollNo+", "+this.studentName;
    }

    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
