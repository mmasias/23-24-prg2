class Library {
    public Library(String name, Location address);

    public boolean operative();
    public void addBook(Book book);
    public void addUser(User user);
    public void (Book book);
    public Book[] getAllBooks();
    public User[] getAllUsers();
    public Loan[] getUserLoans(User user);
    public void open();
    public void close();
}

class Book {
    public Book(String title, String author, String category);
}

class Loan {
    public Loan(Book book, User user, int id);
}

class User {
    public User(String name, int age, String profession);

    public Loan loanBook(Book book);
}

class Location {
    public Location (String street, int number);
}

Location address = new Loction('Calle Albert Einstein', 16);
Library miBiblioteca = new Library("Biblioteca Alex", address);

if(miBiblioteca.operative()) {
    Book sapiensBook = new Book('Sapiens', 'Yuval Noah Harari', "Science");
    miBiblioteca.addBook(sapiensBook);

    User carlos = new User("Carlos", 26, "Teacher");
    miBiblioteca.addUser(carlos);

    Book[] books = miBiblioteca.getAllBooks();
    Loan loan = carlos.loanBook(sapiensBook);
    Loan[] userLoans = miBiblioteca.getUserLoans(carlos);

} else {
    miBiblioteca.open();
}

miBiblioteca.close();