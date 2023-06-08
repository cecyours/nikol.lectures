// import Student;

package school;
public class Teacher {
    
    private String private_uname = "Sneha private_uname";
    public String public_uname = "Sneha public_uname";
    protected String protected_uname = "Sneha protected_uname";
    String uname = "Sneha";

    public String studentName()
    {
        return new Student().protected_uname;
    }
}
