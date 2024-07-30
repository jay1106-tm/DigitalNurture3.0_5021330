import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book linearSearch(String title) {
        for (Book book: books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearch(String title) {
        int left = 0;
        int right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            int compare = books.get(mid).getTitle().compareToIgnoreCase(title);
            if (compare == 0) {
                return books.get(mid);
            } else if (compare < 0) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return null;
    }
}
