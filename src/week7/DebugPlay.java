package week7;

public class DebugPlay {
    String title;
    String author;

    public DebugPlay(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("The performance is " + title +
                " by " + author);
    }
}