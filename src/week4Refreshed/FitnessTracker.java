package week4Refreshed;

public class FitnessTracker {

    private Boolean Running;
    private String date;
    private double runningTime;

    // Default Constructor
    public FitnessTracker() {
        setRunning(true);
        setDate("January 1 2019");
        setRunningTime(0.00);
    }

    // Initial-Value Constructor
    public FitnessTracker(Boolean isRunning, String date, double runningTime) {
        setRunning(isRunning);
        setDate(date);
        setRunningTime(runningTime);
    }

    // Setter Methods
    public void setRunning(Boolean running) { Running = running; }
    public void setDate(String date) { this.date = date; }
    public void setRunningTime(double runningTime) { this.runningTime = runningTime; }

    // Getter Methods
    public double getRunningTime() { return runningTime; }
    public String getDate() { return date; }
    public Boolean getIsRunning() { return Running;}
}
