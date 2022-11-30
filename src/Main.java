import java.util.*;

public class Main {

    Scanner in = new Scanner(System.in);
    static Main main = new Main();

    private int hour, inSeconds;

    public static void main(String[] args) throws Exception {
        main.startProgram();
    }

    public void startProgram() {
        queryHour();
        System.out.println("There are " + getInSeconds() + " seconds in " + hour + " hour(s).");
    }

    public void queryHour() {
        System.out.print("Enter hour(s): ");
        hour = in.nextInt();
        setInSeconds(hour);
    }

    public void setInSeconds(int hour) {
        inSeconds = (hour * 60) * 60;
    }

    public int getInSeconds() {
        return inSeconds;
    }
}