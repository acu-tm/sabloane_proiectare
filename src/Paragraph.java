public class Paragraph implements Element{
    String text;

    public Paragraph(String text) {
        this.text = text;
    }


    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
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
