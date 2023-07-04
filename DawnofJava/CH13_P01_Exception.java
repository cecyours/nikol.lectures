import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CH13_P01_Exception {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number 1 : ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter number 2 : ");
        int b = Integer.parseInt(br.readLine());

        int c = 0;

        try {
            c = a / b;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is an error..");
        }

        System.out.println(a + " / " + b + " = " + (c));

        System.out.println("Hello World...");

    }
}
