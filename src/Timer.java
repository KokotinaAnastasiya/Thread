public class Timer implements Runnable {
    private int sec;

    public Timer(int sec) {
        this.sec = sec;
    }

    public void run() {
        while (true) {
            if (sec != 0) {
                System.out.println("Tic-tac" + this.sec+ " ");
                this.sec--;
            } else {
                break;
            }
        }
    }
}