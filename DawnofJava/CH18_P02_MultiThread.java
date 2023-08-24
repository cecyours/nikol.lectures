public class CH18_P02_MultiThread extends Thread {

    public static void main(String[] args) throws Exception {

        MyThread user1 = new MyThread("               Sneha");
        MyThread user2 = new MyThread("Kites");

        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);

        t2.start();
        t1.start(); // p1
 
        // t2.join();

    }
}

class MyThread implements Runnable {

    String user;
    static int ix = 0;

    public MyThread(String user) {
        this.user = user;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println((++ix) + " Hi  " + this.user);

            if (this.user.equals("Kites")) {
                try {

                    Thread.sleep(10);
                } catch (Exception e) { 

                }
            }
        }
    }
}
