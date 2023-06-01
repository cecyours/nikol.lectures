
class PrintWorld{
    public static void main(String args[])
    {

        // System.out.print("Apple\n");
        // System.out.println("Banana\n");
        // System.out.print("Cherry\n");
        int n = 5;
        for(int i=1;i<=10;i++)
        {
            // System.out.println(n+" x "+i+" = "+(n*i));
            System.out.printf("%2d x %2d = %2d\n",n,i,n*i);
        }
    }
}