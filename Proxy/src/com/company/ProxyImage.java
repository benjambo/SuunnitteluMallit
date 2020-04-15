package com.company;

class ProxyImage implements Image {
    private final String filename;
    private final String imageName;
    private RealImage image;

    /**
     * Constructor
     * @param filename name of the file
     * @param imageName name of the image
     */
    public ProxyImage(String filename, String imageName) {
        this.filename = filename;
        this.imageName = imageName;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename, imageName);
        }
        image.displayImage();
    }

    /**
     * Show data of image
     */
    public void showData() {
        System.out.println("Image name: " + imageName);
    }
}
