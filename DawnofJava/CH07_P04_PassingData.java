public class CH07_P04_PassingData {
    public static void main(String[] args) {
        
        Method m = new Method();

        Student s1 = new Student(1, "Heema");
        Student s2 = new Student(2, "Sneha");
        Student s3 = new Student(3, "Gk");
        Student s4 = new Student(4, "Mohan");
        Student s5 = new Student(5, "Shivu");

        Student list[] = {s1,s2,s3,s4,s5};

        m.sum(10, 41);// passing value

        m.displayList(list); // passing array
    }
}

class Method{

    // passing values
    void sum(int a,int b)
    {
        System.out.println(a+" + "+b+" = "+(a+b));
    }

    //passing object
    void display(Student s)
    {
        System.out.println("Welcome "+s.studentName+"-"+s.rollNo);   
    }

    // passing array
    void displayList(Student s[])
    {
        for(Student i:s)
        {
            display(i);//passing object
        }
    }
    
}
class Student{

    String studentName;
    int rollNo;
    public Student()
    {

    }

    public Student(int rollNo,String studentName)
    {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }
}
