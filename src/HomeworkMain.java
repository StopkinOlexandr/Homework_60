import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkMain {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author 3", "Book 3", 250));
    books.add(new Book("Author 1", "Book 2", 251));
    books.add(new Book("Author 3", "Book 1", 252));

//    Collections.sort(books);
    books.sort((Book book1, Book book2) -> {
      if (!book1.getAuthor().equals(book2.getAuthor())) {
        return book1.getAuthor().compareTo(book2.getAuthor());
      }
      return book1.getTitle().compareTo(book2.getTitle());
    });


    for (Book b : books) {
      System.out.println(b);
    }
  }
}
