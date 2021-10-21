import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String name;
    List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubchapter(String name){
        SubChapter subChapter = new SubChapter(name);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubchapter(int index) {
        return subChapters.get(index);
    }
}
