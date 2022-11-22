package monnaie;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

public class Couteau extends Item {

    private final boolean taille;

    /**
     * @param n
     * @param p
     * @param t
     */
    public Couteau(final String n, final Monnaie p, final boolean t) {
        super(n, p);
        taille = t;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        if (taille) {
            return "couteaux " + nom + "(" + prix.toString() + ")";
        } else {
            return "petit couteaux " + nom + "(" + prix.toString() + ")";
        }
    }

    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Couteau couteau = (Couteau) o;
        return taille == couteau.taille && nom.equals(couteau.nom)
                && this.prix == couteau.getPrix();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prix, taille);
    }
}
