// Main class to demonstrate using the Visitor pattern in a library system
public class Library {
    public static void main(String[] args) {
        // Initialize library items.
        LibraryItem book = new Book("123456789", "Effective Java");
        LibraryItem journal = new Journal("987654321", "The Computer Journal");

        // Initialize visitors.
        LibraryItemVisitor inventoryVisitor = new LibraryInventoryVisitor(); // Visitor for inventory management.
        LibraryItemVisitor lendVisitor = new LibraryLendVisitor(); // Visitor for lending items.

        // Perform inventory operation on both book and journal.
        book.accept(inventoryVisitor);
        journal.accept(inventoryVisitor);

        // Perform lending operation on both book and journal.
        book.accept(lendVisitor);
        journal.accept(lendVisitor);
    }
}
