import java.util.Scanner;

public class CH07_P06_table_recursion {
    public static void main(String[] args) {

        Table t = new Table(5);
        t.show();

        // Scanner s = sc.getNewObject();
    }
}

class Table{
    
    int number;
    int i=0;
    public Table(int number)
    {   
        this.i=1;
        this.number = number;
    }

    void show()
    {
        if(this.i==11) // Base case
            return;

        System.out.println(this.number+" x "+this.i+" = "+(this.i*this.number));
        
        this.i++;
        show();
    }
    
}
