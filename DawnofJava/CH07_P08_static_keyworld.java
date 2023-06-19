public class CH07_P08_static_keyworld {
    static{ // static block
        System.out.println("Happy world");
    }
    public static void main(String[] args) {
        
        Regsiter r1 = new Regsiter("Sneha");
        Regsiter r2 = new Regsiter("heena");
        Regsiter r3 = new Regsiter("gk");


        System.err.println("current user : "+Regsiter.getCurrentName());

        
        Regsiter r4 = new Regsiter("neha");
        System.out.println("student register : "+r1);

        
        Regsiter r5 = new Regsiter("pravin");

        System.out.println("student register : "+r2);
        System.out.println("student register : "+r3);
        System.out.println("student register : "+r4);
        System.out.println("student register : "+r5);

    }
}

class Regsiter{
    static{ //static block
        System.out.println("Happy 3 world");
    }
    // static variable - data member
    private static String tableName;

    public Regsiter(String username)
    {
        this.tableName = username;
    }

     void display()
    {
        System.out.println(tableName);
    }

    public String toString()
    {
        return this.tableName;
    }

    //static method
    static String  getCurrentName()
    {
        return tableName;
    }

}
