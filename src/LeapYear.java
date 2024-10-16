import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(args[0] + " is " + ((Integer.parseInt(args[0]) % 4 == 0 && Integer.parseInt(args[0]) % 100 != 0) || Integer.parseInt(args[0]) % 400 == 0 ? "" : "not ") + "a leap year.");
    }
}
