public class ThreadCreate {
    private int cycle;
    private int sec;


    public ThreadCreate(int cycle, int sec) {
        this.cycle = cycle;
        this.sec = sec;
    }

    public static void threadGo(int cycle, int sec) {
        while (cycle != 0) {

            Timer timer = new Timer(sec);
            Thread thread = new Thread(timer);
            thread.start();
            cycle--;
        }
    }

}
