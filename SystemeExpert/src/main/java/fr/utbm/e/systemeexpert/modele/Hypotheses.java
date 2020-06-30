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
public class Hypotheses<T> {
    private ArrayList<T> hypotheses;
    private ArrayList<T> newhypotheses;
    public Hypotheses(){
        hypotheses = new ArrayList<T>();
        newhypotheses = new ArrayList<T>();
    }
    
    public void addHypothese(T h){
        hypotheses.add(h);
    }

    public void addNewHypothese(T h){
        newhypotheses.add(h);
    }
    
    public Hypotheses(ArrayList<T> hypotheses) {
        this.hypotheses = hypotheses;
        newhypotheses = new ArrayList<T>();
    }

    public List<T> getHypotheses() {
        return hypotheses;
    }

    public void setHypotheses(ArrayList<T> hypotheses) {
        this.hypotheses = hypotheses;
    }
    
    public String toString(){
        String hyp="";
        String newhyp="";
        for(int i=0;i<hypotheses.size();i++){
            hyp = (i == 0) ? hyp + hypotheses.get(i) : hyp + ',' + hypotheses.get(i);
        }
        if(newhypotheses.size() > 0){
            for (int i = 0; i < newhypotheses.size(); i++) {
                newhyp = (i == 0) ? newhyp + newhypotheses.get(i) : newhyp + "," + newhypotheses.get(i);
            }
        }
        return "{" + hyp + "}" + newhyp;
    }
}
