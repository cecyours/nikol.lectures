public class CH05_P02_StringConstructor {
    public static void main(String[] args) {
        
        String s1 = new String("Hello World");
        System.out.println(s1);

        char ch[] = {'d','s','a','i','a'}; 
        String s2 = new String(ch,1,3); //char_arr,star,count
        System.out.println(s2);

        byte b[] = {65,65,96,97,67};
        String s3 = new String(b,1,2);
        System.out.println(s3);
    }
}
