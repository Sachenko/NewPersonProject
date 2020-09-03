package person;


import java.util.TimerTask;

public class TestPrinter extends TimerTask {


    public TestPrinter() {
        System.out.println("test Printer");
    }

    public void run() {

        System.out.println("Timer is go " + ++Task.i);
    }
}
