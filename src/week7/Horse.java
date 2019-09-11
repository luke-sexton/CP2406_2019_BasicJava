package week7;

public class Horse {
    String name;
    String colour;
    String birth;
    int year;

    public Horse(String name, String colour, String birth, int year) {
        setName(name);
        setColour(colour);
        setBirth(birth);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        String space = " ";
        System.out.println("General Horse: " + getName() + space + getColour() + space + getBirth() + space + getYear());
    }
}
