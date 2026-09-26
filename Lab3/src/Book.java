//the name for the class can be SchoolBook, but not RentBook or ReadBook because the latter two are verbs.
//class name: nouns and capital letters!!
//OOP follows object (thing) vs method (action) so we avoid verbs for className to avoid confusion. although it would not cause an error in the code
//what will cause an error instead are the ff: starting with a number, using spaces, using reserved keyword like public class void
public class Book {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = 0;
    }

    //    second constructor -- constructor overloading
    public Book(String title, int totalPages) {
        this(title,"Unknown", totalPages);
    }

    public void readPages(int pages) {
        this.currentPage += pages;
        if (this.currentPage > this.totalPages) {
            this.currentPage = this.totalPages;
            System.out.println("Finished pages");
        } else {
            System.out.println("Current page: " + this.currentPage);
        }
    }

    public double getProgress(){
        return ((double) this.currentPage / this.totalPages) * 100;
    }

    public static void main(String[] args){
        Book myBook = new Book("A Little Life", "Forgot", 800);
        myBook.readPages(650);
        System.out.println("A Little Life Book Progress" + myBook.getProgress() + "%:");
    }


}
