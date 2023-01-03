public class RottenPotato {
    //movies


    int[][] ratings;
    public RottenPotato() {
        ratings = new int[][] { {4, 6, 2, 5},
                                {7, 9, 4, 8},
                                {6, 9, 3, 7} };
    }

    public int[][] getRatings() {
        return ratings;
    }


    public double movieAvgRating(int[][] ratings, int movie) {
        double avg = 0;
        for (int i[]: ratings) {
            avg += i[movie];
        }
        return avg/ratings.length;
    }


    public double reviewerAvgRating(int[][] ratings, int reviewer) {
        double avg = 0;
        for (int i : ratings[reviewer]) {
            avg += i;
        }
        return avg / ratings[reviewer].length;
    }

    public double avgRating2022(int[][] ratings) {
        double avg = 0;
        for (int i[]: ratings) {
            for (int k = 0; k < i.length; k ++) {
                avg += i[k];
            }
        }
        return avg/(ratings.length*ratings[0].length);
    }

    public int hardestRater2022(int[][] ratings) {
        int count = 0;
        int maxCount = 0;

        int outcome = 0;
        for (int i = 0; i < ratings.length; i ++) {
            for (int k: ratings[i]) {
                count += k;
            }
            if (count >= maxCount) {
                maxCount = count;
                outcome = i;
            }

        }
        return outcome;
    }

    public int worstMovie2022(int[][] ratings) {
        int count = 0;
        int minCount = Integer.MAX_VALUE;

        int outcome = 0;
        for (int i = 0; i <ratings[0].length; i ++) {
            for (int k[]: ratings) {
                count += k[i];
            }
            if (count <= minCount) {
                minCount = count;
                outcome = i;
            }
            count = 0;
        }
        return outcome;

    }

    public boolean isFresh(int[][] ratings, int movie) {

        if (movieAvgRating(ratings, movie) > avgRating2022(ratings)) return true;
        return false;
    }

}
