package week8;

public class Participant {
    String name;
    String streetAddress;
    int age;

    public Participant(String name, String streetAddress, int age) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "Age: " + this.age + "Street Address: " + this.streetAddress;
    }

    public boolean equals(Participant otherParticipant) {
        return this.toString().equals(otherParticipant.toString());
    }
}
