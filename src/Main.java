import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What would you like to type out? ");
        String input = scanner.nextLine();

        System.out.println("Starting in 15 seconds...");
        Thread.sleep(1500);

        Robot robot = new Robot();
        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));

            int rand = (int) (Math.random()*(100-50+1)+50);
            Thread.sleep(rand);
        }
    }
}

