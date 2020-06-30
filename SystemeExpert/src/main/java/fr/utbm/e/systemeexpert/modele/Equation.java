/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.e.systemeexpert.modele;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nzoda
 */
public class Equation<T> {

    private ArrayList<T> premisses;
    private T resultat;

    public Equation(){
        premisses = new ArrayList<T>();
    }
    
    public Equation(ArrayList<T> premisses, T resultat) {
        this.premisses = premisses;
        this.resultat = resultat;
    }

   

    public void removePremisse(T element) {
        premisses.remove(premisses.indexOf(element));
    }

    public boolean isEmptyPremisse() {
        return premisses.isEmpty();
    }

    public List<T> getPremisses() {
        return premisses;
    }

    public void setPremisses(ArrayList<T> premisses) {
        this.premisses = premisses;
    }

    public T getResultat() {
        return resultat;
    }

    public void setResultat(T resultat) {
        this.resultat = resultat;
    }
    
    public String toString(){
        String format = "";
        if(premisses.size()>0)
            format = premisses.get(0) +"";
        for(int i=1;i<premisses.size();i++){
            format = format + "^" + premisses.get(i);
        }
        return format + "=>" + resultat;
    }
}
