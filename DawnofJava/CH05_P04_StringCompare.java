public class CH05_P04_StringCompare {
    public static void main(String[] args) {
        
        String s1 = "Sneha";
        String s2 = "Sneha";

        // A : 65
        // a : 97
        boolean b1 = s1==s2;
        System.out.println(s1+" == "+s2+" : "+b1);
    

        int b2 = s1.compareTo(s2);
        System.out.println(s1+" compareTo "+s2+" : "+b2);


        int b3 = s1.compareToIgnoreCase(s2);
        System.out.println(s1+" compareToIgnoreCase "+s2+" : "+b3);

        boolean b4 = s1.equals(s2);
        System.out.println(s1+" equals "+s2 +" : "+b4);

        boolean b5 = s1.equalsIgnoreCase(s2);
        System.out.println(s1+" equalsIgnoreCase "+s2 +" : "+b5);

    }
}
