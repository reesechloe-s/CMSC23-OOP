public class LibraryBook {
    private String title;
    private boolean isBorrowed;

    public LibraryBook(String title){
        this.title = title;
        isBorrowed = false;
    }
    void borrowBook(){
        if (isBorrowed == false){
            isBorrowed = true;
            System.out.println("You checked out the book.");
        } else {
            System.out.println("It is unavailable");
        }
    }
}