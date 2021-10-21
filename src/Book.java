import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    Autor autor;

    List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public int createChapter(String name){
        Chapter chapter = new Chapter(name);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void addAuthor(Autor autor){
        this.autor=autor;
    }
}
