import java.util.ArrayList;

public abstract class Polinomio {

    // ArrayList di coefficienti
    protected ArrayList<Double> coefficienti;

    // ArrayList delle soluzioni
    protected ArrayList<Double> soluzioni;

    // Costruttore
    public Polinomio() {
        this.coefficienti = new ArrayList<>();
        this.soluzioni = new ArrayList<>();
    }

    // Metodo per stampare i coefficienti
    public void stampaCoefficienti() {
        System.out.println("\nCoefficienti del polinomio:");
        for (int i = 0; i < coefficienti.size(); i++) {
            System.out.println("a" + i + " = " + coefficienti.get(i));
        }
    }

    // Metodo per stampare le soluzioni
    public void stampaSoluzioni() {
        if (soluzioni.isEmpty()) {
            System.out.println("\nNessuna soluzione calcolata.");
        } else {
            System.out.println("\nSoluzioni trovate:");
            for (Double s : soluzioni) {
                System.out.println(s);
            }
        }
    }

    // Metodo astratto
    public abstract void Risolvi();
}
