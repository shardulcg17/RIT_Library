// Concrete Element representing a Journal in the library
public class Journal implements LibraryItem{
    private String issn; // ISSN number of the journal.
    private String title; // Title of the journal.

    // Constructor to initialize a new Journal object.
    public Journal(String issn, String title) {
        this.issn = issn;
        this.title = title;
    }

    // Method to accept a visitor. It allows the visitor to perform an operation on this Journal.
    @Override
    public void accept(LibraryItemVisitor visitor) {
        visitor.visit(this); // The specific visit method for Journal is called.
    }

    // Getter for ISSN number.
    public String getIssn() {
        return issn;
    }

    // Getter for title.
    public String getTitle() {
        return title;
    }
}
