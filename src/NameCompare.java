import java.util.Comparator;

public class NameCompare implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.bookName.compareTo(o2.bookName);
    }



}
