public class Retta extends Polinomio {

    // ax + b = 0
    public Retta(double a, double b) {
        super();
        coefficienti.add(a); // a
        coefficienti.add(b); // b
    }

    @Override
    public void Risolvi(){
        double a = coefficienti.get(0);
        double b = coefficienti.get(1);

        if(a == 0){
            if (b == 0){
                System.out.println("Equazione indeterminata: infinite soluzioni.");
            } else {
                System.out.println("Equazione impossibile: nessuna soluzione.");
            }
        } else {
            double x = -b / a;
            soluzioni.add(x);
        }
    }
}
