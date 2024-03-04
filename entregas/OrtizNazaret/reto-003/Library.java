class Library {
    public Library(String name, Location address);

    public boolean operative();
    public void addBook(Book book);
    public void addUser(User user);
    public void (Book book);
    public Book [] getAllBooks();
    public User [] getAllUsers();
    public Loan [] getUserLoans(User user);
    public boolean isBookAvailable(Book book);
    public void open ();
    public void close();
}

class Book {
    public Book(String authors, String title, String category);
}

class Loan {
    public Loan(Book book, User user, int id);
}

class User {
    public User (String name, int age, String id);

    public Loan [] getUserLoans();
}

class Location {
    public Location (String street, int number);
}

Location address = new Location ("Calle Rogelo De Egusquiza", 6);
Library myLibrary = new Library("Deras Library", address);
if (myLibrary.operative()){
    Book myBook = new Book ("Holly", "Stephen King", "Horror");
    myLibrary.addBook(myBook);

    User Paula = new User("Paula", 19, 88025439890);
    myLibrary.addUser(Paula);

    Book [] books = myLibrary.getAllBooks();
    if(myLibrary.isBookAvailable(myBook)) {
        Loan loan = Paula.loanBook(myBook);
    }

    Loan [] userLoans = myLibrary.getUserLoans(Paula);

}else {
    myLibrary.open();
}

    myLibrary.close();