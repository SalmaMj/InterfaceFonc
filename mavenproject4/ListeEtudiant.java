/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ListeEtudiant implements GestionEtudiant {
    
    List<Etudiant> etudiants = new ArrayList<Etudiant>();
    public ListeEtudiant(){
    
    }

    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Object consumer) {
        System.out.println("etudiants");
        
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Object predicate, Object cons) {
        for (Etudiant Etudiants : etudiants) {
      if (e.getId() == Genre.id) {
        etudiantMasculins.add(e);
      }
    }
    
    Collections.sort(etudiantsMasculins, new Comparator<Etudiant>() {
      @Override
      public int compare(Etudiant p1, Etudiant p2) {
        return p2.getNom() - p1.getNom();
      }
    });

   

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Object f) {
      for(int i=0; i<m_Nom.size(); i++){//parcour de tous les étudiants
            System.out.prinltn(m_nom.elementAt(i) + " - " + m_Prenom.elementAt(i) + " - " + m_Numero.elemenAt(i);
        }   
    }
       
    }

   
    
   
}
