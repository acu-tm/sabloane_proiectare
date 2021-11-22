import java.awt.*;

public class ImageProxy implements Picture{
    String url;
    Dimension dim;
    Image realImage;

    public ImageProxy(String url) {
        super();
        this.url = url;
    }

    Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}
