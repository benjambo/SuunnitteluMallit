package com.company;

public class Down implements Command{
    private Screen screen;

    public Down(Screen screen){
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.setDown();
    }
}