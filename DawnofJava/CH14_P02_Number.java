public class CH14_P02_Number {
    public static void main(String[] args) {

        Double d = 10089.99;

        byte b = d.byteValue();
        System.out.println("your byte value : " + b);

        int i = d.intValue();
        short s = d.shortValue();
        long l = d.longValue();
        float f = d.floatValue();

        System.out.println(" int  : " + i);
        System.out.println(" short  : " + s);
        System.out.println(" long  : " + l);
        System.out.println(" float  : " + f);

    }
}
