package com.company;

public class WallButton {
    Command command;

    public WallButton(Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
