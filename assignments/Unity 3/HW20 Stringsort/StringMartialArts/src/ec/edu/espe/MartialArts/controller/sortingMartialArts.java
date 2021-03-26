/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MartialArts.controller;

/**
 *
 * @author Pc
 */
public class sortingMartialArts {
    
     public static String[] sortingMartialArts(String[] name) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <5  - j; i++) {
                if (name[i].compareTo(name[i + 1]) > 0) {
                    String aux;
                    aux = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = aux;
                }
            }
        }
        return name;
    }
}

