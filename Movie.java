public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String titulo;
    private Price preco;

    public Movie(String title, int priceCode) {
        this.titulo = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return titulo;
    }

    public int getPriceCode() {
        return preco.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                preco = new RegularPrice();
                break;
            case CHILDRENS:
                preco = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                preco = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Código de preço incorreto");
        }
    }

    public double getCharge(int daysRented) {
        return preco.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return preco.getFrequentRenterPoints(daysRented);
    }
}
