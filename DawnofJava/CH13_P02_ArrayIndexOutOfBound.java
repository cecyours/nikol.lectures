import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CH13_P02_ArrayIndexOutOfBound {
    public static void main(String[] args) throws Exception {

        Student sList[] = new Student[5];

        sList[0] = new Student(1, "Snena");
        sList[1] = new Student(2, "gk");
        sList[2] = new Student(3, "shivu");
        sList[3] = new Student(4, "hiren");
        sList[4] = new Student(5, "mohan");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your rollno : ");
        int index = Integer.parseInt(br.readLine()) - 1;

        try {
            System.out.println(sList[index]);
        } catch (IndexOutOfBoundsException e) {

            System.out.println("rollno not found ... try [1 ... " + sList.length + "]");
        }

    }
}

class Student {
    private int rollno;
    private String studentName;

    public Student(int rollno, String studentName) {
        this.rollno = rollno;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "{rollno : " + this.rollno + ", studentName: " + this.studentName + "}";
    }
}
