/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elelmialgoritmusok;

import java.util.Arrays;

/**
 *
 * @author thomas
 */
public class ElelmiAlgoritmusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vektor = {5, 9, 2, 14, 12, 7, 8, 15, 3, 1, 4, 10, 6, 11, 13};
        
        /*
        Eld�nt�s
        F - 5-tel oszthat�
        */
        boolean szerepel = false;
        for(int elem : vektor)
            if(elem % 5 == 0)
                szerepel = true;
        
        //Pr�ba
        if(szerepel)
            System.out.println("Van benne");
        else
            System.out.println("Nincs benne");
        
        /*
        Megsz�ml�l�s
        F - p�ros
        */
        int darab = 0;
        for(int elem : vektor)
            if(elem % 2 == 0)
                darab++;
        //Teszt
        System.out.println("A p�rosak sz�ma: "+darab);
        
        /*
        Sz�ls��rt�k keres�s
        min-max feladatok
        max a p�lda
        */
        
        int maxHely = 0;
        for(int i=1; i<vektor.length; i++)
            if( vektor[maxHely] < vektor[i])
                maxHely = i;
        
        //Teszt
        System.out.println("A t�mb legnagyobb eleme: "+vektor[maxHely]);
        System.out.println("Ez az elem a "+maxHely+" index�.");
        
        /*
        Keres�s
        Adott F tulajdons�g� elem megkeres�se:
        line�ris
        F - 7-tel oszthat�
        */
        
        int hely=-1;
        for(int i=0; i<vektor.length;i++)
            if(vektor[i] % 7 == 0){
                hely = i;
                break;
            }
        
        /*
        Csere
        */
        int [] t�mb = {99,10};
        int tmp = t�mb[0];
        t�mb[0] = t�mb[1];
        t�mb[1] = tmp;
        
        
        /*
        Rendez�s
        */
        
        int [] vektor2 = {5, 9, 2, 14, 12, 7, 8, 15, 3, 1, 4, 10, 6, 11, 13};
        Arrays.sort(vektor2);
        //Ismerni kell egy alaprendez�si algoritmust!
        for(int elem: vektor2)
            System.out.print(elem+ " ");
        System.out.println("");
    }
    
}
