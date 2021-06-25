package ua.me.training.util;

import java.util.Scanner;

public class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getStringValue() {
        return scanner.nextLine();
    }
}
