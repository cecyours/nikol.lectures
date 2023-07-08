public class CH13_P05_Re_throwException {
    public static void main(String[] args) {

        Task t = new Task();
        t.task1();
    }
}

class Task {

    void task1() {
        try {
            task2();
        } catch (Exception e) {
            System.out.println("Exception in task1");
        }
    }

    void task2() {
        try {
            int x = 10/0;
        } catch (Exception e) {
            System.out.println("Exception in task2");
            throw e; // re-throw.
        }
    }
}
