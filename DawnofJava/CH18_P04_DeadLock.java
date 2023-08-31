public class CH18_P04_DeadLock {
    public static void main(String[] args) throws Exception {

        Interview sneha = new Interview();
        Interview gk = new Interview();
        
        Employer employer = new Employer(sneha, gk);
        Candidate candidate = new Candidate(sneha, gk);

        Thread emp = new Thread(employer);
        Thread can = new Thread(candidate);

        emp.start();
        // emp.join(); // prevent the deadlock.
        can.start();

    }
}

class Employer implements Runnable {

    Interview sneha, gk;

    public Employer(Interview sneha, Interview gk) {
        this.sneha = sneha;
        this.gk = gk;
    }

    public void run() {
        synchronized (sneha) {
            System.out.println("Employer : give me experience");

            try {

                Thread.sleep(1999);
                synchronized (gk) {
                    System.err.println("Employer : gk want job to gain experince");
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Candidate implements Runnable {
    Interview sneha, gk;

    public Candidate(Interview sneha, Interview gk) {
        this.sneha = sneha;
        this.gk = gk;
    }

    public void run() {
        synchronized (gk) {
            System.out.println("Candidate : give me job");

            try {

                Thread.sleep(1999);
                synchronized (sneha) {
                    System.err.println("Candidate : sneha want experience ");
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Interview extends Object {

}
