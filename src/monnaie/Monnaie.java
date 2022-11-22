package monnaie;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Monnaie {
    private final HashMap<String, Integer> pieces;

    public Monnaie() {
        pieces = new HashMap<>();
        for (Piece piece : Piece.values()) {
            pieces.put(piece.name(), 0);
        }
    }
    public static final Monnaie ZERO = new Monnaie();

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Piece piece : Piece.values()) {
            output.append(pieces.get(piece.name())).append(piece.name().toLowerCase().charAt(0)).append(" ");
        }
        return output.toString().trim();
    }

    public Monnaie ajoute(final int r, final Piece type) {
        Monnaie subSum = new Monnaie();
        subSum.pieces.putAll(pieces);
        subSum.pieces.put(type.name(), this.pieces.get(type.name()) + r);
        System.out.println(subSum.pieces);
        return subSum;
    }

    public Monnaie plus(final Monnaie m) {
        Monnaie sum = new Monnaie();
        for (Map.Entry<String, Integer> entry : m.pieces.entrySet()) {
            String piece = entry.getKey();
            Integer value = entry.getValue();
            sum.pieces.put(piece, this.pieces.get(piece) + value);
        }
        return sum;
    }

    public Integer get(final Piece type) {
        return pieces.get(type.name());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Monnaie monnaie = (Monnaie) o;
        for (String piece : pieces.keySet()) {
            if (!Objects.equals(monnaie.pieces.get(piece), pieces.get(piece))) {
                return false;
            }
        }
        return true;
    }
}

