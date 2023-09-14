import javax.swing.*;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.DEFAULT_OPTION;

public class valutaConvert {

    public static void valutaKalkulator(Valuta val1, Valuta val2, Valuta val3) {

        double nyPris = 0;
        String output = "";
        String[] options = {"Fra","Til"};
        int fraTilNr = JOptionPane.showOptionDialog(null,"Fra NOK eller til NOK?",
        "Valuta konverter",YES_NO_CANCEL_OPTION,DEFAULT_OPTION,null,options,options[0]);
        String tallLest = showInputDialog("Hvor mye skal konverteres?");
        double lestNr = Double.parseDouble(tallLest);
        if (lestNr <= 0){
                showMessageDialog(null,"Feil, tar ikke inn 0 eller negative verdier.");
                return;
        }
        String tallLest3 = showInputDialog("Hvilken valuta?\n Skriv 1 for SEK.\n Skriv 2 for EUR.\n Skriv 3 for USD.");
        int hvilkenValuta = Integer.parseInt(tallLest3);
        if(hvilkenValuta < 1 || hvilkenValuta > 3){
                showMessageDialog(null,"Feil, velg et nr fra 1-3");
                return;}
        else {
                if (fraTilNr == 0) {
                    if (hvilkenValuta == 1) {
                        nyPris = lestNr * val1.getValuta();
                        output += "Du valgte fra fra NOK til SEK med valuta på 1.04 og ";
                    }
                    if (hvilkenValuta == 2) {
                        nyPris = lestNr * val2.getValuta();
                        output += "Du valgte fra fra NOK til EUR med valuta på 1.04 og ";
                    }
                    if (hvilkenValuta == 3) {
                        nyPris = lestNr * val3.getValuta();
                        output += "Du valgte fra fra NOK til USD med valuta på 1.04 og ";
                    }
                }
                if (fraTilNr == 1) {
                    if (hvilkenValuta == 1) {
                        nyPris = lestNr / val1.getValuta();
                        output += "Du valgte fra fra SEK til NOK med valuta på ... og ";
                    }
                    if (hvilkenValuta == 2) {
                        nyPris = lestNr / val2.getValuta();
                        output += "Du valgte fra fra EUR til NOK med valuta på ... og ";

                    }
                    if (hvilkenValuta == 3) {
                        nyPris = lestNr / val3.getValuta();
                        output += "Du valgte fra fra USD til NOK med valuta på ... og ";
                    }

                }
            }
        showMessageDialog(null,output +"den nye prisen er nå " +nyPris);
    }
}
