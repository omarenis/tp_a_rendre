package monnaie;

public class Item {
    /** l'attribut nom presente le nom unique de l'item **/
    protected final String nom;
    /**
     * prix de l'item
     */
    protected Monnaie prix;

    public Item(final String nom, final Monnaie prix) {
        this.nom = nom;
        this.prix = prix != null ? prix : new Monnaie();
    }

    /**
     * @return String
     */
    public Monnaie getPrix() {
        return prix;
    }

    /**
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return nom.equals(item.nom) && prix.equals(((Item) o).prix);
    }

    /**
     * @param ajoute : String
     */
    public void augmenteDe(final Monnaie ajoute) {
        if (ajoute != null) {
            prix = prix.plus(ajoute);
        }
    }
}
