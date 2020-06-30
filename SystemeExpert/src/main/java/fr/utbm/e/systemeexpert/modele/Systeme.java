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
public class Systeme {
    private ArrayList<Equation> equations;
    
    public Systeme(){
       equations =  new ArrayList<Equation>(); 
    }
    
    public Systeme(ArrayList equations) {
        this.equations = equations;
    }
    
    public void addEquation(Equation e){
        equations.add(e);
    }
    
    public List<Equation> getEquations() {
        return equations;
    }

    public void setEquations(ArrayList equations) {
        this.equations = equations;
    }
    
    public String toString(){
        String format = "Systeme\n";
        for(int i=0;i<equations.size();i++){
            format += equations.get(i).toString()+"\n";
        }
        return format;
    }
}
