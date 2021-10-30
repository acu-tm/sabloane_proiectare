import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    String title;
    List<Element> content = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }


    @Override
    public void print() {
        System.out.println(this.title);
        for (Element e:content){
            e.print();
        }
    }

    @Override
    public void add(Element e) {
        content.add(e);
    }

    @Override
    public void remove(Element e) {
        if (content.contains(e))
            content.remove(e);
    }

    @Override
    public Element get(int index) {
        return content.get(index);
    }
}
