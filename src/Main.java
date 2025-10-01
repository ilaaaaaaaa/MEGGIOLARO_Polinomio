import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer opzione;
        do{
            System.out.println("---ESERCIZIO SUI POLINOMI---");
            System.out.println("Menù: \n1. per risolvere l'equazione di una retta, \n2. per risolvere l'equazione di una parabola.");
            System.out.println("Indica il numero dell'opzione: ");

            opzione = sc.nextInt();
        }while(opzione < 1 || opzione > 2);

        Double a;
        Double b;
        Double c;

        if (opzione == 1){
            // Inserimento dei parametri
            System.out.println("Inserisci a: ");
            a = sc.nextDouble();

            System.out.println("Inserisci b: ");
            b = sc.nextDouble();

            // Creazione dell'oggetto Retta
            Retta r = new Retta(a, b);
            r.Risolvi();

            // Stampa
            r.stampaCoefficienti();
            r.stampaSoluzioni();
        } else {
            // Inserimento dei parametri
            System.out.println("Inserisci a: ");
            a = sc.nextDouble();

            System.out.println("Inserisci b: ");
            b = sc.nextDouble();

            System.out.println("Inserisci c: ");
            c = sc.nextDouble();

            // Creazione dell'oggetto Parabola
            Parabola p = new Parabola(a, b, c);
            p.Risolvi();

            // Stampa
            p.stampaCoefficienti();
            p.stampaSoluzioni();
        }

    }
}