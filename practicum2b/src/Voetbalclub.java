public class Voetbalclub {
    int aantalGewonnen;
    int aantalGelijk;
    int aantalVerloren;
    String naam;

    public Voetbalclub(String tempnaam){
        naam = tempnaam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten(){
        return 3*aantalGewonnen + aantalGelijk;
    }

    @Override
    public String toString() {
        return naam + "   " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten() ;
    }
}
