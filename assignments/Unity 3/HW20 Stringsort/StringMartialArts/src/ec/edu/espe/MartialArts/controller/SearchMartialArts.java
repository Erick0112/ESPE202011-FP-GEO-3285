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
public class SearchMartialArts {

public int  findName(String[] name, String dataname) {
    
        int n = name.length;
        for (int i = 0; i < n; i++) {
            if (name[i] == null ? dataname == null : name[i].equals(dataname)) {
                
                return i;
            }
        }
        return -1;
    }
}
