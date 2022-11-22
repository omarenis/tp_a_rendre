package monnaie;

public class Bouteille extends Item {

    /**
     *
     */
    public Bouteille() {
        this(null, null);
    }

    /**
     * @param nom
     * @param prix
     */
    public Bouteille(String nom, Monnaie prix) {
        super(nom, prix);
    }

    @Override
    public String toString() {
        return "bouteille " + nom + "(" + prix.toString() + ")";
    }
}
