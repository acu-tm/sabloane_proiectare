import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture{
    String imageName;

    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.imageName);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int n) {
        return null;
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
