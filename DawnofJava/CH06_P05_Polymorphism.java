public class CH06_P05_Polymorphism {
    public static void main(String[] args) {

        Task t = new Task();

        System.out.println(" method : "+t.sum());// m1
        System.out.println(" method : "+t.sum(7,-5));//m2
        System.out.println(" method : "+t.sum(-5,8,0));//m3
        
    }
}

class Task{

    public int sum() //m1
    {
        return 1;
    }

    public int sum(int a,int b) //m2
    {
        return a+b;
    }

    public int sum(int a,int b,int c) //m3
    {
        return a+b+c;
    }
}