import java.awt.desktop.ScreenSleepEvent;
import java.awt.event.KeyEvent;
import java.awt.*;

public class Main {
    public static void main(String[] argv) throws Exception {

        Robo robot = new Robo();
        bobber poredi = new bobber();

        while(true){

            robot.uslikaj();

            Thread.sleep(150);

            boolean povuci = false;

            povuci = !poredi.provjera1();

            System.out.println(povuci);

            if(povuci){

                robot.pritisni();
            }
        }
    }
}