public class Image implements Element{
    String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.url);
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

}
