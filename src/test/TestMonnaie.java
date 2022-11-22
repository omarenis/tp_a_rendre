package test;
import monnaie.Monnaie;
import monnaie.Piece;

import java.util.Arrays;

public class TestMonnaie extends AbstractTest {

    public static void main(String[] args) throws Erreur {
        Monnaie m1 = new Monnaie();
        Monnaie m2 = m1.ajoute(2, Piece.OR);
        Monnaie m3 = m2.ajoute(4, Piece.CUIVRE).ajoute(3, Piece.OR);
        Monnaie m4 = m3.plus(m2);
        verifieEquals(m1.toString(), "0o 0a 0c");
        verifieEquals(m2.toString(), "2o 0a 0c");
        System.out.println(m3);
        verifieEquals(m3.toString(), "5o 0a 4c");
        verifieEquals(m4.toString(), "7o 0a 4c");
        verifieTrue(m1.equals(Monnaie.ZERO));
        verifieTrue(m3.equals(Monnaie.ZERO.ajoute(5, Piece.OR).ajoute(4, Piece.CUIVRE)));
        verifieTrue(m2.hashCode() == Monnaie.ZERO.ajoute(2, Piece.OR).hashCode());
        verifieTrue(m1.get(Piece.OR) == 0);
        verifieTrue(m3.get(Piece.OR) == 5);
        verifieTrue(m3.get(Piece.ARGENT) == 0);
        verifieTrue(m3.get(Piece.CUIVRE) == 4);
        verifieTrue( Piece.NOMBRE == 3);
        verifieTrue( Piece.TOUTES.equals("[OR, ARGENT, CUIVRE]"));
        System.out.println (" ****** Test OK ******");
    }
}