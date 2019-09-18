package week8;

public abstract class NewsPaperSubscription {
    protected String name;
    protected String address;
    protected double rate;


    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int value) {
        this.rate = value;
    }

    public abstract void setAddress(String value);

}
