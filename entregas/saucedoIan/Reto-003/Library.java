class User {
    public User(String name, String surname) 
    public String addName(String name)
    public String addSurname(String surname) 
}

class Book {
    public Book(String title, String author, boolean available) 
    public String addTitle(String title)
    public String addAuthor(String author) 
    public boolean isAvailable(boolean available) 
}

class Loan {
    public Loan(User user, Book book, LocalDateTime dateTime) 
    public User addUser() 
    public Book addBook() 
    public LocalDateTime addDateTime()
}

class Library {
    public Library(User user, Book book, Loan loan, int maxBooks, int maxLoans, int openingHour, int closingHour) {
    public User addUser(User user) 
    public Loan addLoan(Loan loan) 
    public void openLibrary(int openingHour)
    public void closeLibrary(int closingHour)
    public void addBook(Book book)
    public void removeBook(Book book) 
}


public class World {
    public static void main(String[] args) {
        Library library = new Library(user, book, loan, 100, 50, 7, 18);

        User newUser = new User("Ana", "Gomez");
        library.user = newUser;

        Loan newLoan = new Loan(newUser, book, LocalDateTime.now());
        library.loan = newLoan;

        System.out.println("User: " + library.addUser().addName() + " " + library.addUser().addSurname());
        System.out.println("Loan: " + library.addLoan().addDateTime());
    }
}
