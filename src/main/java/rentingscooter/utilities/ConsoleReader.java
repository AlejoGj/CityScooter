package rentingscooter.utilities;

import java.util.Scanner;

public class ConsoleReader {

    static public final Scanner sc = new Scanner(System.in);

    public static String readString (String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int readInt (String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


}
