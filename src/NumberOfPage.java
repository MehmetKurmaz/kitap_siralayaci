import java.util.Comparator;

public class NumberOfPage implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.numberOfPage-o2.numberOfPage;
    }
}
