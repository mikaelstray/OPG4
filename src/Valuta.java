public class Valuta {
     private final String navn;
     private final double valutaForhold;
     private final int nummer;

    public Valuta (String navn, double valutaForhold, int nummer){
        this.navn = navn;
        this.valutaForhold = valutaForhold;
        this.nummer = nummer;
    }



    public String toString(){
        return navn +", "+valutaForhold + "-,";
    }
    public double getValuta(){
        return valutaForhold;
    }
    public String getNavn(){
        return navn;
    }
    public int getNummer(){
        return nummer;
    }
}
