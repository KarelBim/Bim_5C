package Ukol2;

public class Hrac {
    private String jmeno;
    private String pozice;
    private int goly;
    private String[] poziceArray = {"útočník","brankář","obrana"};
    public Hrac(String jmeno,int pozice, int goly) {
        this.jmeno = jmeno;
        this.pozice = poziceArray[pozice];
        if (goly < 0){
            goly = 0;
        }
        this.goly = goly;
    }
    public String getJmeno() {
        return jmeno;
    }
    public String getPozice() {
        return pozice;
    }
    public int getGoly() {
        return goly;
    }
}
