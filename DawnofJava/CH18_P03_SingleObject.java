public class CH18_P03_SingleObject {
    public static void main(String[] args) {
        
        BookTickets b1 = new BookTickets(3);
         

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);

        t1.setName("Sneha");
        t2.setName("Radhey");

        t1.start();
        t2.start();

    }
}

class BookTickets implements Runnable{

    int totalTickets = 7;
    int wanted;
    public BookTickets(int wanted)
    {
        this.wanted = wanted;
    }
    @Override
    public void run()
    {   
        // logic to buy
        synchronized(this)
        {
            System.out.println("Total  : "+totalTickets);

            if(totalTickets>=wanted)
            {
                // sell the ticked
                System.out.println(Thread.currentThread().getName()+" is buying "+wanted);

                try {
                    Thread.sleep(1000);
                totalTickets -= wanted; 
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            else{
                System.out.println("no available..."+Thread.currentThread().getName());
            }
        }
    }
}
