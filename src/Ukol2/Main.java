package Ukol2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hrac> hracy =  new ArrayList<Hrac>();
        ArrayList<Integer> odstranit = new ArrayList<>();
        hracy.add(new Hrac("Pepa",0,5));
        hracy.add(new Hrac("Adam",1,1));
        hracy.add(new Hrac("Jaroslav",2,0));
        hracy.add(new Hrac("Vladislav",1,2));
        hracy.add(new Hrac("Martin",0,10));
        hracy.add(new Hrac("Ondra",1,1));
        hracy.add(new Hrac("Metoděj",0,3));
        Hrac prvni = new Hrac("spatny",2,0);
        Hrac druhy = new Hrac("spatny",2,0);
        Hrac treti = new Hrac("spatny",2,0);
        int celkemGolu = 0;
        Iterator<Hrac> itr = hracy.iterator();
        while(itr.hasNext()){
            Hrac hrac = itr.next();
            if(hrac.getPozice().equals("útočník")){
                System.out.println(hrac.getJmeno() + " je útočník");
            }
            if(hrac.getGoly() == 0){
                itr.remove();
            }
            celkemGolu += hrac.getGoly();
            if(hrac.getGoly() > prvni.getGoly()){
                treti = druhy;
                druhy = prvni;
                prvni = hrac;
            }
            else if(hrac.getGoly() > druhy.getGoly()){
                treti = druhy;
                druhy = hrac;
            }
            else{
                treti = hrac;
            }
        }
        Hrac[] hracyNej = {prvni,druhy,treti};
        System.out.println("Celkem gólů: " + celkemGolu);
        System.out.println("Hráč s nejvíce góly: " + prvni.getJmeno());
        System.out.println("Nejlepší hráči:");
        for(int i = 0; i < hracyNej.length; i++){
            System.out.println(i + 1 + ". " + hracyNej[i].getJmeno());
        }
    }
}
