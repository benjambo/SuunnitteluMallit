package com.company;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("LBA: " + lba);
        System.out.println("Size on file " + size + " KB");
        return new byte[size];
    }
}
