package ua.me.training.service;

import ua.me.training.exception.IncorrectInputOrderException;
import ua.me.training.exception.NotMatchesWordException;

import java.util.Optional;

public class HelloWorldService {
    
    private final String firstWord = "Hello";
    private final String secondWord = "world!";
    private boolean isFirstEntered = false;
    
    public Optional<String> processWord(String input) {
        if (input.equals(firstWord) && !isFirstEntered) {
            isFirstEntered = true;
            return Optional.empty();
        } else if (input.equals(secondWord) && isFirstEntered) {
            return Optional.of(String.format("%s %s", firstWord, secondWord));
        } else if (input.equals(secondWord)) {
            throw new IncorrectInputOrderException("Please, start entering with word \"Hello\"");
        } else {
            throw new NotMatchesWordException("Please, check spelling the word");
        }
    }
}
