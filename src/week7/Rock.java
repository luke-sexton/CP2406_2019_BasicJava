package week7;

public class Rock {
    int sampleNumber;
    int weight;
    String description;


    public Rock(int sampleNumber, int weight) {
        setSampleNumber(sampleNumber);
        setWeight(weight);
        setDescription("Unclassified");
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
