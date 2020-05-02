package com.company;

public class CPU {
    public void freeze() {
        System.out.println("Computer Froze");
    }
    public void jump(long position) {
        System.out.println("Changing executable program position to " + position);
    }
    public void execute() {
        System.out.println("Execute");
    }
}
