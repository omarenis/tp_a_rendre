package test;

import monnaie.Bouteille;
import monnaie.Couteau;
import monnaie.Monnaie;
import monnaie.Panier;
import monnaie.Piece;

public class TestAugmentationDesPrix extends AbstractTest {
	public static void main(String[] args) throws Erreur {
	   Bouteille bXs1 = new Bouteille("XS", Monnaie.ZERO.ajoute(3,Piece.OR));
	   Bouteille bXs2 = new Bouteille("XS", Monnaie.ZERO.ajoute(3,Piece.OR));
	   Bouteille bS = new Bouteille("S", Monnaie.ZERO.ajoute(1,Piece.ARGENT).ajoute(1,Piece.CUIVRE));
	   verifieTrue (bXs1.equals(bXs2));
	   verifieTrue (bXs1.hashCode() == bXs2.hashCode());
	   verifieFalse (bXs1.equals(bS));
	   verifieFalse (bS.equals(bXs1));
	   bXs1.augmenteDe(Monnaie.ZERO.ajoute(2, Piece.OR)); 
	   verifieTrue (bXs1.hashCode() == bXs2.hashCode());
	   
	   Couteau cXs1 = new Couteau("XS", Monnaie.ZERO.ajoute(3,Piece.OR), true);
	   Couteau cXs2 = new Couteau("XS", Monnaie.ZERO.ajoute(3,Piece.OR), false);
	   Couteau cXs3 = new Couteau("XS", Monnaie.ZERO.ajoute(3,Piece.OR), true);
	   verifieTrue (cXs3.equals(cXs1));
	   verifieFalse (cXs1.equals(cXs2));
	   verifieFalse (cXs2.equals(cXs1));
	   verifieFalse (bXs1.equals(cXs1));
	   verifieFalse (bXs1.equals(cXs2 ));
	   verifieFalse (cXs1.equals(bXs1));
	   verifieFalse (cXs2.equals(bXs1));
	   verifieTrue (cXs1.hashCode() == cXs3.hashCode());
	   cXs1.augmenteDe(Monnaie.ZERO.ajoute(1, Piece.CUIVRE)); 
	   verifieTrue (cXs1.hashCode() == cXs3.hashCode());
	   
	   Panier p = new Panier();
	   p.ajoute(bXs2);
	   verifieTrue( p.nombre() == 1);
	   p.enleve(new Bouteille("XS", Monnaie.ZERO.ajoute(3,Piece.OR)));
	   verifieTrue( p.estVide());
	   
	    System.out.println (" ****** Test OK ******");
	}
}
