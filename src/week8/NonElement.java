package week8;

public class NonElement extends Element {
    public NonElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    void describeElement() {
        System.out.println("\nSymbol: " + symbol + "\nAtomic Number: " + atomicNumber +
                "\nAtomic Weight: " + atomicWeight + "\nDescription: Non elements are poor conductors.");
    }
}
