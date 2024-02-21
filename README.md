# RIT Library System

## Project Overview

The RIT Library System project is designed to demonstrate the implementation of the Visitor design pattern within a library context. This project showcases how different operations, such as inventory management and lending, can be applied to library items (books and journals) without altering their classes. This approach adheres to the open/closed principle, one of the SOLID principles in software engineering, which states that software entities should be open for extension but closed for modification.

## Features

- **Visitor Pattern Implementation**: Utilizes the Visitor design pattern to perform operations on library items.
- **Extensible Library Item Types**: Supports different types of library items, initially including books and journals, with the flexibility to add more types in the future.
- **Inventory Management**: Includes a visitor for inventory management that can list items and their details.
- **Lending System**: Features a visitor for lending library items, demonstrating how items can be checked out.

## Structure

The project is structured into several key components:

- **LibraryItem Interface**: An interface for all items in the library that can be visited.
- **Concrete Library Items**: Classes representing specific types of library items, such as `Book` and `Journal`.
- **LibraryItemVisitor Interface**: An interface for visitors, declaring methods for visiting different types of library items.
- **Concrete Visitors**:
  - `LibraryInventoryVisitor` for inventorying items.
  - `LibraryLendVisitor` for lending items.
- **Library Class**: The main class that demonstrates the use of visitors with library items.

## Usage

1. **Compilation**: Compile the Java source files in your preferred development environment or using a command-line tool.
2. **Execution**: Run the `Library` class to see the Visitor pattern in action. The program will simulate inventory management and lending operations on predefined books and journals.
3. **Extending the Project**: To add more library item types or operations, implement additional `LibraryItem` subclasses and `LibraryItemVisitor` implementations, respectively.

## Example Output

Running the `Library` class will produce output similar to the following, demonstrating the application of both inventory management and lending operations on library items:

Inventorying book: ISBN = 123456789, Title = Effective Java
Inventorying journal: ISSN = 987654321, Title = The Computer Journal
Lending book: Effective Java
Lending journal: The Computer Journal