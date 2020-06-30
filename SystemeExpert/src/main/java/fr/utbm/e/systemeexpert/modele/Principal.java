/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.e.systemeexpert.modele;

/**
 *
 * @author nzoda
 */
public class Principal {
     public static void doOperation(Hypotheses H, Systeme S) {
        //Parcours de chacune des hypotheses dans la collection
        for (int i = 0; i < H.getHypotheses().size(); i++) {
            //Pour chaque hypothese nous parcourons chacune des équations du systeme
            for (int j = 0; j < S.getEquations().size(); j++) {
                //Pour chacune des équations du systeme on teste si l'hypothese est contenu à l'interieur
                if (S.getEquations().get(j).getPremisses().contains(H.getHypotheses().get(i))) {
                    //Si la condition est vérifiée on retire l'hypothèse de l'ensemble des premisses de l'équation
                    S.getEquations().get(j).removePremisse(H.getHypotheses().get(i));
                    //Si la premisse est vide
                    if (S.getEquations().get(j).isEmptyPremisse()) {
                        //Réupération de l'équation
                        Equation e = S.getEquations().get(j);
                        //ajout du résultat de l'équation dans la liste des hypothèses
                        H.addHypothese(e.getResultat());
                        //ajout de l'hypothese dans la liste des hypothèses nouvellement ajouté pour differencier de l'hypothèse de base
                        H.addNewHypothese(e.getResultat());
                        //Suppréssion du résultat de l'équation
                        e.setResultat("");
                    }
                }
            }
        }
    }
}
