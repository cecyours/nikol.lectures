// doest support mutable(changable).
//so, String is immutable
public class CH05_P05_StringMutabilies {
    public static void main(String[] args) {
        
        String s1 = "Sneha";
        String s2 = "Java";

        String s3 = s1.concat(s2);

        System.out.println("new String : "+s1);
        System.out.println("new String : "+s3);

    }
}
