package week7;

public class DemoRocks {
    public static void main(String[] args) {
        IgneousRock igneous = new IgneousRock(1, 200);
        MetamorphicRock metamorphic = new MetamorphicRock(2, 500);
        SedimentaryRock sedimentary = new SedimentaryRock(3, 100);

        displayRock(igneous);
        displayRock(metamorphic);
        displayRock(sedimentary);

    }

    private static void displayRock(Rock rock) {
        System.out.println("\nSample Number: " + rock.getSampleNumber() + "\nWeight (grams): " + rock.getWeight() +
                "\nDescription: " + rock.getDescription());
    }
}
