public class RegularPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double valor = 2;
        if (daysRented > 2)
            valor += (daysRented - 2) * 1.5;
        return valor;
    }
}
