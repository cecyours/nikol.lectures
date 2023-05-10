import java.util.Scanner;

/**
 * CH02_P18_Other_operators
 */
public class CH02_P18_Other_operators {

    public static void main(String[] args) {
        
        
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        
        
        boolean f;
        
        try{

            f = s instanceof Student;
        }
        catch(Exception e)
        {
            f = false;
        }

        System.out.println(" status : "+f);
        
    }
}

class Student{
    // code 
}

