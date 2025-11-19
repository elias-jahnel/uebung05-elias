package h3;

public class H3_main {
    public static void main(String[] args) {

        int[][] einheiten = {
            {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
            new int[15]   // zweite Zeile: alles 0
        };

        int input = 6279;   // oder irgendein anderer Testwert

        int rest = input;

        for (int i = 0; i < einheiten[0].length; i++) {

            int wert = einheiten[0][i];

            // Wie viele Stücke dieses Werts werden benötigt?
            int anzahl = rest / wert;
            // In die zweite Zeile eintragen
            einheiten[1][i] = anzahl;

            // Restbetrag aktualisieren
            rest = rest % wert;
        }

        // Ausgabe des Ergebnisses
        for (int i = 0; i < einheiten[0].length; i++) {
            System.out.print(einheiten[1][i] + " ");
        }
    }
}
