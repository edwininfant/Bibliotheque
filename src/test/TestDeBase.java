package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import metier.Adherent;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.EnumCategorieEmploye;
import metier.Exemplaire;
import metier.Utilisateur;
import bibliothequesDAO.ExemplairesDao;
import bibliothequesDAO.UtilisateurDAO;

public class TestDeBase {

	public TestDeBase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExemplairesDao exemplaireDAO = new ExemplairesDao();
		
		System.out.println(" Voice le Exemplaire du Id : 1");
		System.out.println(exemplaireDAO.findByKey(1));
		System.out.println("------------------------------");
		System.out.println(" Voice le Exemplaire du Id : 2");
		System.out.println(exemplaireDAO.findByKey(2));
		
		
		Exemplaire ex1,ex2,ex3,ex4;
		
		ex1=exemplaireDAO.findByKey(1);
		ex2=exemplaireDAO.findByKey(2);
		ex3=exemplaireDAO.findByKey(3);
		ex4=exemplaireDAO.findByKey(4);
        
		UtilisateurDAO uDAO = new UtilisateurDAO();
		
		
	
		System.out.println(" Find By Adherent  Id : 1000");
		System.out.println(uDAO.findByKey(1000));
		System.out.println("------------------------------");
		System.out.println(" Find By Adherent  Id : 1001");
		System.out.println(uDAO.findByKey(1001));
		System.out.println("------------------------------");
		


	
		System.out.println(" Find By Employee  Id : 10000");
		System.out.println(uDAO.findByKey(10000));
		System.out.println("------------------------------");
		System.out.println(" Find By Employee   Id : 10001");
		System.out.println(uDAO.findByKey(10001));
		System.out.println("------------------------------");
		System.out.println("----Creation d'un Emprunt en cours pour un Adherent----------");
		
		
		UtilisateurDAO uDAO2 = new UtilisateurDAO();
		Adherent a1 = (Adherent) uDAO2.findByKey(1000);
		Adherent a2 = (Adherent) uDAO2.findByKey(1001);
		
		Employe e1 = (Employe) uDAO2.findByKey(10000);
		Employe e2 = (Employe) uDAO2.findByKey(10001);
		EmpruntEnCours empruntEnCours1 = new EmpruntEnCours(a1,ex1,new Date());
		EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(a2,ex2,new Date());
		
		System.out.println("----Creation d'un Emprunt en cours pour un Adherent added successfully---------");
		a1.addEmpruntEnCours(empruntEnCours1 );
	
		
	
		a2.addEmpruntEnCours(empruntEnCours2);
		System.out.println("----Creation d'un Emprunt pour un Employee----------");
		EmpruntEnCours empruntEnCours3 = new EmpruntEnCours(e1,ex3,new Date());
		EmpruntEnCours empruntEnCours4 = new EmpruntEnCours(e2,ex4,new Date());
		e1.addEmpruntEnCours(empruntEnCours3);
		e2.addEmpruntEnCours(empruntEnCours4);
		uDAO2.add(a1);
		uDAO2.add(a2);
		uDAO2.add(e1);
		uDAO2.add(e2);
		
		ArrayList<EmpruntEnCours> ad1collection,em1collection;
		 ad1collection = a1.getEmpruntEnCours();
		Iterator<EmpruntEnCours> ad_iterator = ad1collection.iterator();
		System.out.println("Emprunts en Cours de l'adhérent 1 :\n-------------------------------");
		while(ad_iterator.hasNext()){
			System.out.println(ad_iterator.next());
		}
		em1collection = e1.getEmpruntEnCours();
		Iterator<EmpruntEnCours> emp_iterator = em1collection.iterator();
		System.out.println("Emprunts en Cours de l'employee 1 :\n-------------------------------");
		while(emp_iterator.hasNext()){
			System.out.println(emp_iterator.next());
		}
		
	}

}
