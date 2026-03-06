package Ukol2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hrac> hracy =  new ArrayList<>();
        hracy.add(new Hrac("Pepa",0,5));
        hracy.add(new Hrac("Adam",1,0));
        hracy.add(new Hrac("Jaroslav",2,2));
        hracy.add(new Hrac("Vladislav",1,0));
        hracy.add(new Hrac("Martin",0,3));
        hracy.add(new Hrac("Ondra",1,10));
        hracy.add(new Hrac("Metoděj",0,0));
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
            celkemGolu += hrac.getGoly();
            if(hrac.getGoly() >= prvni.getGoly()){
                treti = druhy;
                druhy = prvni;
                prvni = hrac;
            }
            else if(hrac.getGoly() >= druhy.getGoly()){
                treti = druhy;
                druhy = hrac;
            }
            else if(hrac.getGoly() >= treti.getGoly()){
                treti = hrac;
            }
            if(hrac.getGoly() == 0){
                itr.remove();
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
