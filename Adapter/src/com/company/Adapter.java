package com.company;

public class Adapter implements PhotoAlbum {
    CustomPhotoAlbum customPhotoAlbum;

    public Adapter(String fileType) {
        if(fileType.equals("png")) {
            customPhotoAlbum = new PNG();
        } else if (fileType.equals("jpg")) {
            customPhotoAlbum = new JPG();
        }
    }

    @Override
    public void show(String name, String fileType) {
        if(fileType.equals("png")) {
            customPhotoAlbum.showPNG(name);
        } else if (fileType.equals("jpg")) {
            customPhotoAlbum.showJPG(name);
        }
    }
}
