public class Zwembad {
    double breedte;
    double lengte;
    double diepte;

    public Zwembad(double tempbreed, double templen, double tempdiep){
        breedte = tempbreed;
        lengte = templen;
        diepte = tempdiep;
    }

    public double getBreedte(){
        return breedte;
    }

    public double getLengte(){
        return lengte;
    }

    public double getDiepte(){
        return diepte;
    }

    public double inhoud(){
        return breedte * lengte * diepte;
    }

    public void setBreedte(double tempbreed){
        breedte = tempbreed;
    }

    public void setLengte(double templeng){
        lengte = templeng;
    }

    public void setDiepte(double tempdiep){
        diepte = tempdiep;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
    }

}
