public class CH05_P06_StringBuffer {
    
    public static void main(String[] args) {
        
        StringBuffer s1 = new StringBuffer("Hello World");

        s1.append("Bye");
        System.out.println(s1);

        s1.insert(3,"Sneha");

        System.out.println("insert() : "+s1);
        
        int f = s1.compareTo(new StringBuffer("Hell of code"));
        System.out.println("compareTo() : "+f);

        s1 = new StringBuffer("H");
        System.out.println("capacity() : "+s1.capacity());

        s1 = new StringBuffer("1234567890");
        s1.delete(2, 4);
        System.out.println("delete() : "+s1);

        s1 = new StringBuffer("kites");//21
        s1.ensureCapacity(30);
        System.out.println("capacity() : "+s1.capacity());
        
        // 16
        // 21
         
    }
}

// try more byself.
// https://www.geeksforgeeks.org/stringbuffer-class-in-java/