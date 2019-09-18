package week8;

// An array for different boat types
public class DebugEleven2 {
    public static void main(String[] args) {
        DebugBoat[] ref = new DebugBoat[3];
        DebugRowboat blueBoat = new DebugRowboat();
        DebugRowboat redBoat = new DebugRowboat();
        DebugOceanLiner bigBoat = new DebugOceanLiner();
        ref[0] = redBoat;
        ref[1] = blueBoat;
        ref[2] = bigBoat;
        for (DebugBoat debugBoat : ref) {
            debugBoat.setPassengers();
            debugBoat.setPower();
            System.out.println(debugBoat.toString());
        }
    }
}
