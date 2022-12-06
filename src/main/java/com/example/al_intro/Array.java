package com.example.al_intro;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static boolean isSorted(int[] tab) {
        for(int cpt = 0; cpt < tab.length-1; cpt++) {
            // TODO: Modifier le cpt+1 != tab.length-1 pour que le test passe
            if (tab[cpt] > tab[cpt+1] && cpt+1 != tab.length-1) {
                System.err.println("false");
                return false;
            }

        }
        return true;
    }

    public static int[] insert(int[] tab, int value) {
        ArrayList<Integer> list = new ArrayList<>();
        if(!isSorted(tab)) {
            list.add(value);
            for(int k = 0; k < tab.length-1; k++) {
                list.add(tab[k]);
            }

            tab = new int[list.size()];
            for(int i = 0; i < list.size()-1; i++) {
                tab[i] = (int) list.get(i);
            }
        }else{
            for(int k = 0; k < tab.length-1; k++) {
                list.add(tab[k]);
            }

            list.add(value);
            Collections.sort(list);
            tab = new int[list.size()];
            for(int i = 0; i < list.size()-1; i++) {
                tab[i] = (int) list.get(i);
            }
        }

        return tab;
    }
}
