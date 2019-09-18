package week8;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = {
                new MetalElement("Fe", 26, 55.845),
                new MetalElement("Cu", 29, 63.546),
                new NonElement("F", 9, 18.998),
                new NonElement("H", 1, 1.00784)
        };
        for (Element element : elements) {
            element.describeElement();
        }

    }
}
