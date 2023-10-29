import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book("Monte Cristo Kontu","Alexandre Dumas",300,2019);
        Book book2=new Book("Yaprak Dokumu","Resat Nuri Gultekin",500,2002);
        Book book3=new Book("Kucuk Aga","Tarik Bugra",250,2006);
        Book book4=new Book("Eylul","Mehmet Rauf",350,1999);
        Book book5=new Book("Yaban","Yakup Kadri Karaosmanoglu",323,2008);
        TreeSet<Book> books=new TreeSet<>(new NameCompare());
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        TreeSet<Book> books2=new TreeSet<>(new NumberOfPage());
        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        for (Book s:books2){
            System.out.println(s.bookName);
        }


    }
}