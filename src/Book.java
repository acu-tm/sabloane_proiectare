import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<Object> book = new ArrayList<Object>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String p){
        book.add(p);
    }
    public void createNewImage(String i){
        book.add(i);
    }
    public void createNewTable(String t){
        book.add(t);
    }

    public void print(){
        System.out.println(title);
        for(Object k:book)
            System.out.println(k);
    }
}
