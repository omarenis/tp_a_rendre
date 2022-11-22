package test;

public class AbstractTest {
    static class Erreur extends Exception {
        public Erreur() { super(); }
    }
    public static void verifieTrue(boolean b) throws Erreur {
        if (! b) throw new Erreur();
    }
    public static void verifieFalse(boolean b) throws Erreur {
        if (b) throw new Erreur();
    }
    public static void verifieEquals(Object o1, Object o2) throws Erreur {
        if (! o1.equals(o2)) throw new Erreur();
    }
}