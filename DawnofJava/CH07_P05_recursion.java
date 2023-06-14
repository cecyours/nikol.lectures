public class CH07_P05_recursion {
    public static void main(String[] args) {
        
        Recursion r = new Recursion();
        r.display(10000);
    }
}

class Recursion{

    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    String clrs[];
    public Recursion()
    {
        clrs = new String[9];
        clrs[0] = RESET;
        clrs[1] = BLACK;
        clrs[2] = RED;
        clrs[3] = GREEN;
        clrs[4] = YELLOW;
        clrs[5] = BLUE;
        clrs[6] = PURPLE;
        clrs[7] = CYAN;
        clrs[8] = WHITE;
        
        // generate the list
    }
    void display(int n)
    {   
        if(n==0)
            return;
        int i = (int)(Math.random()*10-1);
        System.out.print(clrs[i]+" Sorry ");
        display(n-1);
    }
}
