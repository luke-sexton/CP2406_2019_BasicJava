package week7;

public class Poem {
    protected String name;
    private int totalLineNumbers;

    public Poem(String name, int totalLineNumbers) {
        setName(name);
        setTotalLineNumbers(totalLineNumbers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalLineNumbers() {
        return totalLineNumbers;
    }

    public void setTotalLineNumbers(int totalLineNumbers) {
        this.totalLineNumbers = totalLineNumbers;
    }
}
