public class CH07_P09_StudentData {
    public static void main(String[] args) {
        
        Student s1 = new Student("Sneha");
        Student s2 = new Student("gk");
        Student s3 = new Student("heena");
        Student s4 = new Student("mohan");
        Student s5 = new Student("riya");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
class Student{

    private int rollNo;
    private String studentName;
    static private int currentNumber;

    public Student(String studentName)
    {
        this.studentName = studentName;
        currentNumber++;
        this.rollNo = currentNumber;
    }

    @Override
    public String toString() {
        
        return "Student name : "+this.studentName+"\t "+this.rollNo;
    }
}
