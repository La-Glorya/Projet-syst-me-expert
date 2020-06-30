
import fr.utbm.e.systemeexpert.modele.Equation;
import fr.utbm.e.systemeexpert.modele.Hypotheses;
import fr.utbm.e.systemeexpert.modele.Systeme;
import fr.utbm.e.systemeexpert.modele.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nzoda
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Accueil acc = new Accueil();
         acc.setVisible(true);
        // TODO code application logic here
        Equation e1 = new Equation(new ArrayList<String>(Arrays.asList("A","B")), "S");
        Equation e2 = new Equation(new ArrayList<String>(Arrays.asList("Q","B")), "E");
        Equation e3 = new Equation(new ArrayList<String>(Arrays.asList("A","B")), "R");
        Systeme S = new Systeme(new ArrayList<Equation>(Arrays.asList(e1,e2, e3)));
        System.out.println("Depart\n");
        System.out.print(S.toString());
        Hypotheses H = new Hypotheses(new ArrayList<String>(Arrays.asList("A","B")));
        System.out.println(H.toString());

        Principal.doOperation(H, S);

        System.out.println("\nFin\n");
        System.out.println(S.toString());
        System.out.println(H.toString());

    }

   

}
