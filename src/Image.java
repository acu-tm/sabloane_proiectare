public class Image {
    String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Image with name: " + imageName;
    }
}
