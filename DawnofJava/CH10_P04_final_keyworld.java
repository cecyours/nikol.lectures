public class CH10_P04_final_keyworld {
    public static void main(String[] args) {
    
       final int i = 10;

        System.out.println("    value of i "+i);
        // i = 19; // u can't change the value of final variable
        System.out.println("new value of i "+i);

        Demon d = new Demon();
        d.display2();
    }
}

final class Demo{

    
    final void display()
    {
        System.out.println("i am the Demo.");
    }
}

class Demon /*extends Demo*/{

  
    void display2() {

        System.out.println("I am demon...");
    }
}

