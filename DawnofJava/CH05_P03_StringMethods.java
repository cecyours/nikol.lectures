public class CH05_P03_StringMethods {
    public static void main(String[] args) {
        
        String s1 = "Hello World";
        
        char ch = s1.charAt(6);
        System.out.println("charAt() : "+ch);

        int unicode = s1.codePointAt(6);
        System.out.println("codePointAt() : "+unicode);

        int bUnicode = s1.codePointBefore(7);
        System.out.println("codePointBefore() "+bUnicode);
 
        int unicodeCount = s1.codePointCount(2,5);
        System.out.println("codePointCount() "+unicodeCount );

        s1 = "ABC";
        String s2 = "abc";
        System.out.println("compareTo() : "+s1.compareTo(s2));
        System.out.println("compareToIgnoreCase() : "+s1.compareToIgnoreCase(s2));

        s1 = "Sneha";
        s2 = "Smart";

        System.out.println("concat() :  "+s1.concat(s2));
        System.out.println("contains() : "+s1.contains("n"));
        System.out.println("contentEquals() : "+s1.contentEquals(s1));

        char h[] = {'1','H','4'};
        s1 = s1.copyValueOf(h,1,2);
        System.out.println("copyValueOf(): "+s1);
        
        // s1 = "Hello4";
        System.out.println("endsWith() : "+s1.endsWith("4"));

        s1 = "Hello There";
        s2 = "hello there";
        System.out.println("equals() : "+s1.equals(s2));
        System.out.println("equalsIgnoreCase() : "+s1.equalsIgnoreCase(s2));

        s1 = "My name is %s, my roll no is %d";
        // %s : String
        // %d : int
        s1 = String.format(s1,"sneha",3);
        System.out.println(s1);

        s1 = "AAAAAAA";
        byte x[] = s1.getBytes();
        for(byte i:x)
        {
            System.out.println(i);
        }

        s1 = "Sneha";
        char c[] = {'1','2','3','4','5','6','7','8','9','0'};
         s1.getChars(0,4,c,5);
        
         for(char i:c)
        {
            System.out.print(i);
        }
        System.out.println("\ngetChars() : "+s1);
    
        s2= new String("A");
        System.out.println("hashCode() : "+s1.hashCode());
        System.out.println("hashCode() : "+s2.hashCode());

        s1 = "Hii, sneha, how are you sneha??";
        System.out.println("indexOf() : "+s1.indexOf("sneha"));
        System.out.println("indexLastOf() : "+s1.lastIndexOf("sneha"));
 
        s1.intern();
        System.out.println("intern() : "+s1.intern());
        
        s1 = new String("Sneha");
        s2 = new String("Sneha");

        System.out.println("compare : "+(s1.equals(s2)));
        System.out.println("compare : "+(s1==s2));
        System.out.println("compare : "+(s1.intern()==s2.intern()));

        s1 = "Hii.";
        System.out.println("isEmpy : "+s1.isEmpty());
        
        Integer i=10;
        System.out.println("toString() "+i.toString());
        System.out.println("valueOf() "+i.valueOf("3"));
    }
}
