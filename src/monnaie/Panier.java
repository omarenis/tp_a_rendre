package monnaie;

import java.util.ArrayList;
public class Panier {
    ArrayList<Item> objects;
      public static int numero = 0;

    public Panier(){
        this.objects = new ArrayList<>();
        numero++;
    }
    public void ajoute(Item b){
        objects.add(b);
    }

    public int nombre (){
        return objects.size();
    }


    public boolean estVide(){
       return objects.isEmpty();
    }

    public Object dernier (){
       if (objects.size()==0){return null;}
       return objects.get(objects.size()-1);
    }


        public void enleve (Bouteille b) {
            for(Object object:objects){
                if(object instanceof Bouteille && b.equals(object)){
                    objects.remove(object);
                    return;
                }
            }
        }

        public void enleve(Object item)
        {
            objects.remove((Item) item);
        }
        public void enleve(Couteau couteau) {
            for(Object object:objects){
                if(object instanceof Couteau && couteau.equals(object)){
                    objects.remove(object);
                    return;
                }
            }
        }

    public String afficheElements(){
        StringBuilder output= new StringBuilder("[");
        for(Item object:objects){
            if(object instanceof Couteau || object instanceof Bouteille){
                output.append(object).append(", ");
            }
        }
        output.append("]");
        return output.toString().replace(", ]", "]");
    }


    public Monnaie prix(){
        Monnaie monnaie = new Monnaie();
        for(Item object:objects) {
            if (object != null) {
                monnaie.plus(object.prix);
            }
        }
        return monnaie;
    }

    @Override
    public String toString(){
         return "panier"+numero+"("+objects.size()+")"+afficheElements();
        }
}
