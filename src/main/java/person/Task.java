package person;

import javax.swing.*;
import java.util.Timer;


public class Task {

    public static int i = 0;


    public Task() {
        Timer timer = new Timer();
        TestPrinter printer = new TestPrinter();
        JOptionPane.showMessageDialog(null, "Timer START");
        timer.schedule(printer, 0, 1000);
    }


}
