import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    
    public List<Book> getBooks(){

        List<Book> books=new ArrayList<>();
        books.add(new Book(100, "Java", 200));
        books.add(new Book(102, "COreJava", 100));
        books.add(new Book(105, "Python", 200));
        books.add(new Book(103, "C++", 108));

        return books;
    }
}
