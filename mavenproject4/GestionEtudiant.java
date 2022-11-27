/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject4;

import java.util.List;

/**
 *
 * @author User
 */
public interface GestionEtudiant {

public void afficherEtudiants(List<Etudiant> etudiants,
Consumer<Etudiant> consumer);

public void afficherEtudiantSelonFiltre(List<Etudiant>etudiants,
Predicate<Etudiant> predicate, Consumer<Etudiant> cons);

public String afficherNomEtudiant(List<Etudiant> etudiants,
Function <Etudiant, String> f);

public Etudiant creeEtudiant(Supplier<Etudiant> supp);

public Stream convertListStream(List<Etudiant> l);

}
