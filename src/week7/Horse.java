package week7;

public class Horse {
    String name;
    String colour;
    int birthYear;

    public Horse(String name, String colour, int birthYear) {
        setName(name);
        setColour(colour);
        setBirthYear(birthYear);
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void display() {
        String space = " ";
        System.out.println("General Horse: " + getName() + space + getColour() + space + getBirthYear());
    }
}
