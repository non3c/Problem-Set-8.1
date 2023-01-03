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
        System.out.println(potato.avgRating2022(potato.getRatings()));
        System.out.println(potato.movieAvgRating(potato.getRatings(), MORBIUS));
    }
}
