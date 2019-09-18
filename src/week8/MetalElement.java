package week8;

public class MetalElement extends Element {
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    void describeElement() {
        System.out.println("\nSymbol: " + symbol + "\nAtomic Number: " + atomicNumber +
                "\nAtomic Weight: " + atomicWeight + "\nDescription: Metals are good conductors of electricity.");
    }
}
