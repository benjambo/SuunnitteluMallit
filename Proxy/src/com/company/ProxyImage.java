package com.company;

class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * @param filename name of the file
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

    /**
     * Show data of image
     */
    public void showData() {
        System.out.println("Image name: " + filename);
    }
}
