package ua.me.training.controller;

import ua.me.training.service.HelloWorldService;
import ua.me.training.view.HelloWorldView;

public class HelloWorldController {

    private final HelloWorldView view;
    private final HelloWorldService service;

    public HelloWorldController() {
        view = new HelloWorldView();
        service = new HelloWorldService();
    }

    public void proceed() {

    }
}
