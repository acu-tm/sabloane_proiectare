import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String name;

    List<Object> book = new ArrayList<Object>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String p){
        Paragraph par = new Paragraph(p);
        book.add(par);
    }
    public void createNewImage(String i){
        Image img = new Image(i);
        book.add(img);
    }
    public void createNewTable(String t){
        Table tab = new Table(t);
        book.add(tab);
    }

    public void print(){
        System.out.println(this.name);
        for(Object k:book)
            System.out.println(k.toString());
    }


}
