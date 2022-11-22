package test;

import monnaie.Bouteille;
import monnaie.Couteau;
import monnaie.Monnaie;
import monnaie.Panier;
import monnaie.Piece;

public class TestPanier extends AbstractTest {
	public static void main(String[] args) throws Erreur {
		Panier p1 = new Panier();
	    verifieTrue( p1.estVide());
	    verifieTrue( p1.nombre() == 0);
	    verifieTrue( p1.dernier() == null);
	    verifieEquals(p1.toString(), "panier1(0)[]"); 
	    Panier p2 = new Panier();
	    p2.ajoute( new Bouteille("canette", Monnaie.ZERO.ajoute(5,Piece.OR)));
	    p2.ajoute( new Couteau("poche", Monnaie.ZERO.ajoute(5,Piece.OR), true));
	    p2.ajoute( new Couteau("pliant", Monnaie.ZERO.ajoute(8,Piece.ARGENT), false));
	    verifieFalse( p2.estVide());
		System.out.println(p2);
	    verifieEquals(p2.toString(), "panier2(3)[bouteille canette(5o 0a 0c), petit couteau poche(5o 0a 0c), "
	    		+ "couteau pliant(0o 8a 0c)]"); 
	    verifieEquals( p2.dernier().toString(), "couteau pliant(0o 8a 0c)");    
	    verifieTrue( p2.nombre() == 3);
	    p2.enleve(new Bouteille("canette", Monnaie.ZERO.ajoute(5,Piece.OR)));
	    verifieTrue( p2.nombre() == 2);
	    p2.enleve(new Bouteille("canette", Monnaie.ZERO.ajoute(5,Piece.OR)));
	    verifieTrue( p2.nombre() == 2);
	    p2.enleve( new Couteau("poche", Monnaie.ZERO.ajoute(5,Piece.OR), false));
	    verifieTrue( p2.nombre() == 2);
	    p2.enleve( new Couteau("poche", Monnaie.ZERO.ajoute(5,Piece.OR), true));
	    verifieTrue( p2.nombre() == 1);
	    p2.enleve( p2.dernier());
	    verifieTrue( p2.estVide());
	    System.out.println (" ****** Test OK ******");
	}
}
