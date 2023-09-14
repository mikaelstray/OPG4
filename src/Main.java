import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {

        Valuta sek = new Valuta("SEK",1.04,1);
        Valuta eur = new Valuta("eur",0.17,2);
        Valuta usd = new Valuta("usd",0.093,3);

        valutaConvert.valutaKalkulator(sek,eur,usd);
    }
}