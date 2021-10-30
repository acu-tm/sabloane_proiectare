import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    String bookTitle;

    List<Autor> autor = new ArrayList<>();
    List<Element> sections = new ArrayList<>();

    public Book(String title) {
        super(title);
        bookTitle=title;
    }

    public void addContent(Element e){
        sections.add(e);
    }

    public void addAuthor(Autor a){
        autor.add(a);
    }

    public void print(){
        System.out.println("Book: " + this.bookTitle);
        System.out.println("Authors:");
        for (Autor a:autor){
            System.out.println(a.getNume());
        }
        for (Element s:sections){
            s.print();
        }

    }
}
