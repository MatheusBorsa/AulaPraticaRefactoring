public class Rental {

    private Movie filme;
    private int diasAlugados;

    public Rental(Movie movie, int daysRented) {
        this.filme = movie;
        this.diasAlugados = daysRented;
    }

    public int getDaysRented() {
        return diasAlugados;
    }

    public Movie getMovie() {
        return filme;
    }

    public double getCharge() {
        return filme.getCharge(diasAlugados);
    }

    public int getFrequentRenterPoints() {
        return filme.getFrequentRenterPoints(diasAlugados);
    }
}
