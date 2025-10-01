public class Parabola extends Polinomio {

    // ax^2 + bx + c = 0
    public Parabola(double a, double b, double c) {
        super();
        coefficienti.add(a); // a
        coefficienti.add(b); // b
        coefficienti.add(c); // c
    }

    @Override
    public void Risolvi(){
        double a = coefficienti.get(0);
        double b = coefficienti.get(1);
        double c = coefficienti.get(2);

        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Non è una parabola, ma una retta!");
        } else if (delta < 0) {
            System.out.println("Nessuna soluzione reale.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            soluzioni.add(x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            soluzioni.add(x1);
            soluzioni.add(x2);
        }
    }

}
