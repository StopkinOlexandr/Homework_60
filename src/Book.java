
//Задача 1
//    Используйте класс Book (книга) из домашнего задания к уроку 45 (см. Book.java).
//
//    Создайте список книг и отсортируйте книги по названию,
//    (при одинаковых названиях - по автору) при помощи лямбда-функции.

public class Book implements Comparable<Book> {

  private final String author;
  private final String title;
  private final int pages;

  // в конструктор которого передавайте автора, название книги и
  // количество страниц.
  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  // сеттеров не будет - все поля final (константы)

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  // они должны сортироваться по авторам, а если авторы совпадают
  // - по названиям (и там, и там - по алфавиту, "в словарном порядке").
  @Override
  public int compareTo(Book other) {
    if (!author.equals(other.author)) { // если авторы не совпадают, то
      return author.compareTo(other.author); // сравнение книг - то же самое, что сравнение авторов
    }
    // сюда мы попадаем, только если авторы совпали
    return title.compareTo(other.title); // сравнение книг - то же самое, что сравнение названий
  }

  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", pages=" + pages +
        '}';
  }
}
