package ua.me.training;

import ua.me.training.controller.HelloWorldController;

public class BootApplication {
    public static void main(String[] args) {
        new HelloWorldController().proceed();
    }
}
