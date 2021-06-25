package ua.me.training.util;

public class ValidationUtil {
    
    public static boolean isWord(String message) {
        return !message.matches(".*\\d.*");
    }
}
