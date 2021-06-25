package ua.me.training.view;

public class HelloWorldView {

    private static final String ANSI_RED =  "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    public static final String CONTAINS_FORBIDDEN_SYMBOLS = ANSI_RED + "\nWrong input! Contains forbidden symbols!";
    
    public static final String STARTER_MESSAGE = "\nIn this application you need to input two words \"Hello\"" +
            " and \"world\". Be attentive! You need to input the word only after invite message and " +
            "after that press enter\n";

    public void printMessage(String message) {
        System.out.println(ANSI_GREEN + message);
    }

    public void printErrorMessage(String message) {
        System.out.println(ANSI_RED + message);
    }
}
