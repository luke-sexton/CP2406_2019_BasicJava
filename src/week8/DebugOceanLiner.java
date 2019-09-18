package week8;

public class DebugOceanLiner extends DebugBoat {
    public DebugOceanLiner() {
        super("Ocean Liner");
        setPassengers();
        setPower();
    }

    @Override
    public void setPassengers() {
        super.passengers = 2400;
    }

    @Override
    public void setPower() {
        super.power = "four engines";
    }
}
