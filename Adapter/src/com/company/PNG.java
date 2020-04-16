package com.company;

public class PNG implements CustomPhotoAlbum {

    @Override
    public void showJPG(String fileType) {
        System.out.println("File type not supported");
    }

    @Override
    public void showPNG(String fileType) {
        System.out.println("Showing: " + fileType);
    }
}
