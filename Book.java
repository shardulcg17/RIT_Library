// Concrete Element representing a Book in the library
public class Book implements LibraryItem{
    private String isbn; // ISBN number of the book.
    private String title; // Title of the book.

    // Constructor to initialize a new Book object.
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    // Method to accept a visitor. It allows the visitor to perform an operation on this Book.
    @Override
    public void accept(LibraryItemVisitor visitor) {
        visitor.visit(this); // The specific visit method for Book is called.
    }

    // Getter for ISBN number.
    public String getIsbn() {
        return isbn;
    }

    // Getter for title.
    public String getTitle() {
        return title;
    }
}
