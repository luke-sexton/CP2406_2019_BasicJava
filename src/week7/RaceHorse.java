package week7;

public class RaceHorse extends Horse {
    private int completedRaces;

    public RaceHorse(String name, String colour, String birth, int year, int completedRaces) {
        super(name, colour, birth, year);
        setCompletedRaces(completedRaces);
    }

    public int getCompletedRaces() {
        return completedRaces;
    }

    public void setCompletedRaces(int completedRaces) {
        this.completedRaces = completedRaces;
    }
}
