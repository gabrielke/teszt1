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
        Eldöntés
        F - 5-tel osztható
        */
        boolean szerepel = false;
        for(int elem : vektor)
            if(elem % 5 == 0)
                szerepel = true;
        
        //Próba
        if(szerepel)
            System.out.println("Van benne");
        else
            System.out.println("Nincs benne");
        
        /*
        Megszámlálás
        F - páros
        */
        int darab = 0;
        for(int elem : vektor)
            if(elem % 2 == 0)
                darab++;
        //Teszt
        System.out.println("A párosak száma: "+darab);
        
        /*
        Szélsõérték keresés
        min-max feladatok
        max a példa
        */
        
        int maxHely = 0;
        for(int i=1; i<vektor.length; i++)
            if( vektor[maxHely] < vektor[i])
                maxHely = i;
        
        //Teszt
        System.out.println("A tömb legnagyobb eleme: "+vektor[maxHely]);
        System.out.println("Ez az elem a "+maxHely+" indexû.");
        
        /*
        Keresés
        Adott F tulajdonságú elem megkeresése:
        lineáris
        F - 7-tel osztható
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
        int [] tömb = {99,10};
        int tmp = tömb[0];
        tömb[0] = tömb[1];
        tömb[1] = tmp;
        
        
        /*
        Rendezés
        */
        
        int [] vektor2 = {5, 9, 2, 14, 12, 7, 8, 15, 3, 1, 4, 10, 6, 11, 13};
        Arrays.sort(vektor2);
        //Ismerni kell egy alaprendezési algoritmust!
        for(int elem: vektor2)
            System.out.print(elem+ " ");
        System.out.println("");
    }
    
}
