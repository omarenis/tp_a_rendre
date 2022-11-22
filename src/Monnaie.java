import java.util.Enumeration;
import java.util.HashMap;

public class Monnaie {
    HashMap<String, Float> pieces;

    public Monnaie(Enumeration<String> pieces)
    {
        this.pieces = new HashMap<>();
        while(pieces.hasMoreElements())
        {
            this.pieces.put(pieces.toString(), (float) 0);
        }
    }
}
