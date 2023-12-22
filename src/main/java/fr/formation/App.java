package fr.formation;

import fr.formation.services.Calcul;

public class App {
    public static void main( String[] args )
    {
        Calcul calcul = new Calcul();

        try {
            calcul.division(5, 0);
        } catch (ArithmeticException e) {
            System.err.println("Division par zero impossible !");
        }

        int res = calcul.somme(2, 3);

        System.out.println(res);
    }
}
