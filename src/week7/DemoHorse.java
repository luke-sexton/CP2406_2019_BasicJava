package week7;

public class DemoHorse {

    public static void main(String[] args) {
        Horse horse = new Horse("Jimmy", "Black", 2019);
        horse.display();

        RaceHorse raceHorse = new RaceHorse(horse.getName(), horse.getColour(), horse.getBirthYear(), 10);
        raceHorse.display();
    }
}
