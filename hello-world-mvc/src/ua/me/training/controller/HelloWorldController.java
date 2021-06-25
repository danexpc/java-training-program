package ua.me.training.controller;

import ua.me.training.service.HelloWorldService;
import ua.me.training.util.InputUtils;
import ua.me.training.util.ValidationUtil;
import ua.me.training.view.HelloWorldView;

import java.util.Optional;

public class HelloWorldController {

    private final HelloWorldView view;
    private final HelloWorldService service;

    public HelloWorldController() {
        view = new HelloWorldView();
        service = new HelloWorldService();
    }
    
    public void proceed() {

        view.printMessage(HelloWorldView.STARTER_MESSAGE);
        view.printMessage("Input first word, please: ");
        boolean isDone = false;
        
        while (!isDone) {
            String input = InputUtils.getStringValue();
            
            if (ValidationUtil.isWord(input)){
                try {
                    Optional<String> maybeOutputString = service.processWord(input);
                    if (maybeOutputString.isPresent()) {
                        view.printMessage(maybeOutputString.get());
                        isDone = true;
                    } else {
                        view.printMessage("Input second word, please: ");
                    }
                } catch (RuntimeException e) {
                    view.printErrorMessage(e.getMessage());
                    view.printMessage("Try again: ");
                }
            } else {
                view.printErrorMessage(HelloWorldView.CONTAINS_FORBIDDEN_SYMBOLS);
                view.printMessage("Try again: ");
            }
        }
    }
}
