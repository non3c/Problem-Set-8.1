public class main {
    private final int MORBIUS = 0;
    private final int WAKANDA_FOREVER = 1;
    private final int AMSTERDAM = 2;
    private final int LOVE_AND_THUNDER = 3;

    //reviewers
    private final int DWIGHT = 0;
    private final int MICHAEL = 1;
    private final int PAM = 2;

    public static void main(String[] args) {
        RottenPotato potato = new RottenPotato();
        System.out.println("The average rating of all the movies is: " + potato.avgRating2022(potato.getRatings()));
        System.out.println("The average rating of Morbius is: " + potato.movieAvgRating(potato.getRatings(), 0));
        System.out.println("The worst movie of 2022 is: " + potato.worstMovie2022(potato.getRatings()));
        System.out.println("The average rating of Dwight is: " + potato.reviewerAvgRating(potato.getRatings(), 0));
        System.out.println("The hardest rater of all is rater #" + potato.hardestRater2022(potato.getRatings()));
        System.out.println("Morbius is fresh? " + potato.isFresh(potato.getRatings(), 0));
    }
}
