package week7;

public class RaceHorse extends Horse {
    private int completedRaces;

    public RaceHorse(String name, String colour, int birthYear, int completedRaces) {
        super(name, colour, birthYear);
        setCompletedRaces(completedRaces);
    }

    public int getCompletedRaces() {
        return completedRaces;
    }

    public void setCompletedRaces(int completedRaces) {
        this.completedRaces = completedRaces;
    }

    public void display() {
        String space = " ";
        System.out.println("RaceHorse: " + this.name + space + this.colour + space + this.birthYear + space +
                "\nRaces Won: " + getCompletedRaces());
    }
}
