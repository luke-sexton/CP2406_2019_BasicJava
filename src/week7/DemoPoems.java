package week7;

public class DemoPoems {
    public static void main(String[] args) {
        Poem poem = new Poem("Hello hello", 15);
        Couplet couplet = new Couplet("I am Couplet");
        Haiku haiku = new Haiku("I am Haiku");
        Limerick limerick = new Limerick("I am Limerick");

        StringBuilder displayPoem = displayPoemDescription(poem);
        StringBuilder displayCouplet = displayPoemDescription(couplet);
        StringBuilder displayHaiku = displayPoemDescription(haiku);
        StringBuilder displayLimerick = displayPoemDescription(limerick);

        System.out.println(displayPoem);
        System.out.println(displayCouplet);
        System.out.println(displayHaiku);
        System.out.println(displayLimerick);

    }

    private static StringBuilder displayPoemDescription(Poem poem) {
        StringBuilder poemDescription = new StringBuilder();
        String newLine = "\n";
        String poemType;
        if (poem.getTotalLineNumbers() == 2) {
            poemType = "Couplet";
        } else if (poem.getTotalLineNumbers() == 3) {
            poemType = "Haiku";
        } else if (poem.getTotalLineNumbers() == 5) {
            poemType = "Limerick";
        } else {
            poemType = "Poem";
        }
        poemDescription.append("Poem Name: ").append(poem.getName()).append(newLine)
                .append("Poem Type: ").append(poemType).append(newLine)
                .append("Number of lines: ").append(poem.getTotalLineNumbers()).append(newLine);
        return poemDescription;
    }
}
