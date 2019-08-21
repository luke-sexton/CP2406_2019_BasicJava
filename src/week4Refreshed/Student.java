package week4Refreshed;

public class Student {
    private int id;
    private double creditHours;
    private double pointsEarned;

    public Student(int id, double creditHours, double pointsEarned) {
        setId(id);
        setCreditHours(creditHours);
        setPointsEarned(pointsEarned);
    }

    // Setter Methods
    public void setId(int value) {
        this.id = value;
    }
    public void setCreditHours(double value) {
        this.creditHours = value;
    }
    public void setPointsEarned(double value) {
        this.pointsEarned = value;
    }

    // Getter Methods
    public int getId() {
        return this.id;
    }
    public double getCreditHours() {
        return this.creditHours;
    }
    public double getPointsEarned() {
        return this.pointsEarned;
    }

    public double calculateGpa() {
        return this.pointsEarned / this.creditHours;
    }
}
