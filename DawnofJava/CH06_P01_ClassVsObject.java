public class CH06_P01_ClassVsObject {
    
    public static void main(String[] args) {
    
        Student s1 = new Student();

        s1.setData("Sneha", 10);
        s1.getData();

    }
}

class Student{
// Class : variable: properties + methods:actions
 
    //variables : always be private
    private int rollNo;
    private String studentName;

    
    public void setData(String studentName,int rollNo)
    {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }


    // methods should be public
    public void getData() // method
    {
        System.out.println("welcome "+studentName+", your rollno "+rollNo);
    }
}
