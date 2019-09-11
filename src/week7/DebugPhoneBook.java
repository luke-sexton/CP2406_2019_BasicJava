package week7;

import javax.swing.*;

public class DebugPhoneBook extends DebugBook {
    private String area;
    private String size;

    DebugPhoneBook(int pages, String city) {
        super(pages);
        this.area = city;
        int CUTOFF = 30;
        if (pages < CUTOFF)
            this.size = "big";
        else
            this.size = "small";
    }

    public void display() {
        JOptionPane.showMessageDialog(null, "The phone book for " + this.area +
                " has " + this.pages + " pages.\nThat is a " +
                this.size + " phone book.");
    }
}