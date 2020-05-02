package com.company;

public class Up implements Command{
    private Screen screen;

    public Up(Screen screen){
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.setUp();
    }
}
