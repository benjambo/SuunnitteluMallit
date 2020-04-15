package com.company;

public class Adapter implements PhotoAlbum {
    CustomImageViewer customImageViewer;

    public Adapter(String fileType) {
        if(fileType.equals("png")) {
            customImageViewer = new PNG();
        } else if (fileType.equals("jpg")) {
            customImageViewer = new JPG();
        }
    }

    @Override
    public void show(String name, String fileType) {
        if(fileType.equals("png")) {
            customImageViewer.showPNG(name);
        } else if (fileType.equals("jpg")) {
            customImageViewer.showJPG(name);
        }
    }
}
