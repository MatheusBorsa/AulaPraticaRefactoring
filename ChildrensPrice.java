public class ChildrensPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double valor = 1.5;
        if (daysRented > 3)
            valor += (daysRented - 3) * 1.5;
        return valor;
    }
}
