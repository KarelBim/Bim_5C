package Ukol1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vypiš řetězec");
        int soucet = 0;
        for(char a : sc.nextLine().toCharArray()) {
            System.out.print((int)a + " ");
            soucet += a;
        }
        System.out.println();
        System.out.println(soucet);
    }
}
