public class Paragraph implements Element{
    String text;
    AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }


    @Override
    public void print() {
        if (this.alignStrategy==null)
            System.out.println(this.text);
        else
            this.alignStrategy.render(this.text);
    }
    public void setAlignStrategy(AlignStrategy aligObj){
        this.alignStrategy=aligObj;
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
