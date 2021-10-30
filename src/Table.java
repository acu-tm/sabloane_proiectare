public class Table implements Element{
    String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(this.title);
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
