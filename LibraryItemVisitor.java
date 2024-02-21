// Visitor interface declaring methods for visiting different types of library items
public interface LibraryItemVisitor {
    void visit(Book book); // Method to visit a Book object.
    void visit(Journal journal); // Method to visit a Journal object.
}
