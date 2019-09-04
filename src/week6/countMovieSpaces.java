package week6;

public class countMovieSpaces {
    public static void main(String[] args) {
        String favouriteMovie = "This is my favourite movie quote";
        int length = favouriteMovie.length();
        int spacesCount = 0;

        for (int x = 0; x < length; ++x) {
            if (favouriteMovie.charAt(x) == ' ') {
                spacesCount += 1;
            }
        }
        System.out.println("Amount of spaces in favourite movie quote: "+ favouriteMovie + " = " + spacesCount);

    }

}
