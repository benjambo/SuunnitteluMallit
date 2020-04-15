package com.company;

class RealImage implements Image {
    private final String filename;
    private final String imageName;

    /**
     * Constructor
     * @param filename name of the file
     * @param imageName name of the image
     */
    public RealImage(String filename, String imageName) {
        this.filename = filename;
        this.imageName = imageName;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading... " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying... " + filename);
    }

    public void showData() {
        System.out.println("Image name: " + imageName);
    }
}
