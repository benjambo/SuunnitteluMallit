package com.company;

public class JPG implements CustomPhotoAlbum {
    @Override
    public void showJPG(String fileType) {
        System.out.println("Showing: " + fileType);
    }

    @Override
    public void showPNG(String fileType) {
        System.out.println("File type not supported");
    }
}
