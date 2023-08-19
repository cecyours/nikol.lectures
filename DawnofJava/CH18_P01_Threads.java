public class CH18_P01_Threads extends Thread {

    boolean f = false;
        int i = 0;

    public void run() {
        while (i<=300) {
            if (this.f)
            {
                return;
            }
            System.out.println("welcome.. " + (++i));
            
            try { 
                Thread.sleep(50);

            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) throws Exception {

        CH18_P01_Threads t = new CH18_P01_Threads();
        t.start();

        for (int i = 0; i < 300; i++) {
            System.out.println(t.i+" ------------ > " + i);
            // System.exit(0);
            Thread.sleep(1000);
        } 
        System.out.println("Hii");
        System.in.read();
        t.f = true;

    }
}
