// Concrete Visitor for lending items from the library
public class LibraryLendVisitor implements LibraryItemVisitor{
    @Override
    public void visit(Book book) {
        // Implementation for checking out a book. This could update a database or a checkout log.
        System.out.println("Lending book: " + book.getTitle());
    }

    @Override
    public void visit(Journal journal) {
        // Implementation for checking out a journal.
        System.out.println("Lending journal: " + journal.getTitle());
    }
}
