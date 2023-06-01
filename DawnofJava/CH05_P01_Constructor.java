

/**
 * CH05_P01_Contructor
 */
public class CH05_P01_Constructor {

    public static void main(String[] args) {
        // Home h = new Home();
        // System.out.println("new world : "+h);
        
        Person p1 = new Person();
        Person p2 = new Person(0, 0);
        Person p3 = new Person(3,1);
        new Person();

        System.out.println(" Current owner : "+p2);

    }
}

class Home{

    String house="HOME";

    public Home()
    {
        house = "HOME";
    }

    public Home(String house)
    {
        this.house = house;
    }
}

class Person{

    public Person() // no args Constructor
    {
        System.out.println("C1 : Hii Sneha "+this);
    }

    public Person(int x) // with parameter
    {
        System.err.println("C2 : Hii Sneha "+this);
    } 

    public Person(int y,int x) //with parameter
    {
        System.out.println("C3 : Hii Sneha "+this);
    }

    
}