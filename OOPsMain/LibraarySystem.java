package OOPsMain;
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String t, String a) {
        this.itemId = id;
        this.title = t;
        this.author = a;
    }

    public abstract int getLoanDuration();
    public void getItemDetails() { System.out.println(title + " by " + author); }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() { System.out.println("Book reserved"); }
    public boolean checkAvailability() { return true; }
}

