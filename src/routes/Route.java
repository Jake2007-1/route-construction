package routes;

public class Route {
    private int km;
    private int nbPont;
    private int nbPassageFaunique;
    private boolean asaphalte;

    public Route(int km, boolean asaphalte, int nbPassageFaunique, int nbPont) {
        this.km = km;
        this.asaphalte = asaphalte;
        this.nbPassageFaunique = nbPassageFaunique;
        this.nbPont = nbPont;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isAsaphalte() {
        return asaphalte;
    }

    public void setAsaphalte(boolean asaphalte) {
        this.asaphalte = asaphalte;
    }

    public int getNbPassageFaunique() {
        return nbPassageFaunique;
    }

    public void setNbPassageFaunique(int nbPassageFaunique) {
        this.nbPassageFaunique = nbPassageFaunique;
    }

    public int getNbPont() {
        return nbPont;
    }

    public void setNbPont(int nbPont) {
        this.nbPont = nbPont;
    }

    public double calculerCout(){
        double cout = 0;
        cout += km * 3.4;
        cout += nbPont * 6;
        cout += nbPassageFaunique * 0.7;
        cout += km * 0.1;
        return cout;
    }
}
