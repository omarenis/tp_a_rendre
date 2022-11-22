package monnaie;

import java.util.Arrays;
import java.util.List;

public enum Piece {
    OR("OR"), ARGENT("ARGENT"), CUIVRE("CUIVRE");

    public static final int NOMBRE=Piece.values().length;
    public static final String TOUTES = Arrays.toString(Piece.values());

    Piece(String name) {
    }
    public String toString(){
        return this.name();
    }
}
