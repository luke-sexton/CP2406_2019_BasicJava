package week7;

public class DebugMusical extends DebugPlay {
    private String composer;
    private String title;
    private String author;

    DebugMusical(String title, String author, String comp) {
        super(title, author);
        this.composer = comp;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("The performance is " + this.title +
                        " by " + this.author + "\nThe music for " + this.title + " is by " + composer);
    }
}