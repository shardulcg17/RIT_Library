// Element interface representing any item in the library that can be visited
public interface LibraryItem {
    // Method to accept a visitor. The specific visitor will perform an operation on the element
    void accept(LibraryItemVisitor visitor);
}
