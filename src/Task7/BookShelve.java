package Task7;
import java.util.ArrayList;


public class BookShelve {
    private ArrayList<Book> bookArrayList = new ArrayList<>();
    public void addBook (Book book) {
        bookArrayList.add(book);
    }
    public ArrayList<Book> putBooksInOrder(){
        ArrayList<Book> orderedListOfBooks = new ArrayList<>();
        ArrayList<Book> temporaryList = bookArrayList;
        while (temporaryList.size()>0){
            for (Book book: temporaryList){
                if (book == findEarliestBook(temporaryList)){
                    orderedListOfBooks.add(book);
                    temporaryList.remove(book);
                }
            }
        }
        return orderedListOfBooks;
    }
    public void showKennel () {
        for (Book book : bookArrayList)
            System.out.println(book);
    }

    public Book findEarliestBook(ArrayList<Book> bookArrayList){
        int maxYear = 0;
        Book earliestBook = null;
        for (Book book: bookArrayList){
            if (book.getYear() > maxYear){
                earliestBook = book;
            }
        }
        return earliestBook;
    }
    public Book findOldestBook(){
        int minYear = 2023;
        Book oldestBook = null;
        for (Book book: bookArrayList){
            if (book.getYear() < minYear){
                oldestBook = book;
            }
        }
        return oldestBook;
    }
}
