package person;


import java.util.TimerTask;

public class TestPrinter extends TimerTask {

    public TestPrinter () {
        System.out.println("Timer is go 10 and STOP ");
    }

    private void task() {
        if (Task.i <= 10) {
            System.out.println("Timer = " + Task.i++);
        } else {
            cancel();
            System.exit(1);
        }
    }


    public void run() {
        task();
    }
}
