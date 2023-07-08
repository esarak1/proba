import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.lang.Math.max;

public class Robo {

    public static void uslikaj() throws IOException, AWTException {

        Robot robot = new Robot();
        Point mis = MouseInfo.getPointerInfo().getLocation();
        int x = (int) mis.getX();
        int y = (int) mis.getY();

        System.out.print(x + " ");
        System.out.print(y);


        int width = 200;
        int height = 200;

        Rectangle area = new Rectangle(Integer.max(-1920,x-width), Integer.max(0,y-height), width*2, height*2);
        robot.keyPress(KeyEvent.VK_C);
        BufferedImage bufferedImage = robot.createScreenCapture(area);

        // Save the captured image to a file
        File outputFile = new File("screenshot.png");
        ImageIO.write(bufferedImage, "png", outputFile);

        System.out.println("Image saved successfully.");
    }

    public static void pritisni() {
        try {
            Robot robot = new Robot();
            // Press right mouse button
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

            // Pause for a short duration between clicks
            Thread.sleep(600);

            // Press right mouse button again
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

            Thread.sleep(1500);
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] argv) throws Exception {

    }
}