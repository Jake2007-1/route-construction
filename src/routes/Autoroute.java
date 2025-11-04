package routes;

public class Autoroute extends Route{

    private int nbEchangeur;

    public Autoroute(int km, boolean asaphalte, int nbPassageFaunique, int nbPont, int nbEchangeur) {
        super(km, asaphalte, nbPassageFaunique, nbPont);
        this.nbEchangeur = nbEchangeur;
    }

    @Override
    public double calculerCout(){
        double cout = 0;
        cout += super.getKm() * 6.8;
        cout += super.getNbPont() * 6;
        cout += super.getNbPassageFaunique() * 0.7;
        cout += super.getKm() * 0.2;
        cout += nbEchangeur * 7;
        return cout;
    }



}
