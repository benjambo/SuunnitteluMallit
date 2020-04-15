package com.company;

public class ImageViewer implements PhotoAlbum {
    Adapter adapter;

    @Override
    public void show(String name, String fileType) {
        if (fileType.equalsIgnoreCase("png")) {
            adapter = new Adapter(fileType);
            adapter.show(name, fileType);
        } else if (fileType.equalsIgnoreCase("jpg")) {
            adapter = new Adapter(fileType);
            adapter.show(name, fileType);
        } else {
            System.out.println("Not supported invalid");
        }
    }
}
