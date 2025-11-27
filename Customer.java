import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String nome;
    private Vector alugueis = new Vector();

    public Customer(String name) {
        this.nome = name;
    }

    public void addRental(Rental arg) {
        alugueis.addElement(arg);
    }

    public String getName() {
        return nome;
    }

    public String statement() {
        Enumeration rentals = alugueis.elements();
        String result = "Registro de Aluguel para " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }

        result += "Total devido é " + getTotalCharge() + "\n";
        result += "Você ganhou " + getTotalFrequentRenterPoints() + " pontos de fidelidade";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = alugueis.elements();
        String result = "<H1>Aluguéis de <EM>" + getName() + "</EM></H1><P>\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "<BR>\n";
        }

        result += "<P>Você deve <EM>" + getTotalCharge() + "</EM><P>\n";
        result += "Neste aluguel você ganhou <EM>" + getTotalFrequentRenterPoints() +
                "</EM> pontos de fidelidade<P>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = alugueis.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = alugueis.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
