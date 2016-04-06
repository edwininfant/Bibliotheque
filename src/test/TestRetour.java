package test;

import java.util.Date;

import metier.Adherent;
import metier.EmpruntArchive;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import bibliothequesDAO.ExemplairesDao;
import bibliothequesDAO.UtilisateurDAO;

public class TestRetour {

	public TestRetour() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ExemplairesDao exemplaireDAO = new ExemplairesDao();
		Exemplaire ex1,ex2;
		ex1=exemplaireDAO.findByKey(1);
		ex2=exemplaireDAO.findByKey(2);
		
		UtilisateurDAO uDAO = new UtilisateurDAO();
		
		Adherent a1 = (Adherent) uDAO.findByKey(1000);
		
		
		
		EmpruntEnCours empruntEnCours1 = new EmpruntEnCours(a1,ex1,new Date());
		a1.addEmpruntEnCours(empruntEnCours1);
		EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(a1,ex2,new Date());
		a1.addEmpruntEnCours(empruntEnCours2);
		
		System.out.println(" Affichage avant le retour");
		System.out.println("Statut du Exemplaire"+ex1.getStatus());
		System.out.println("Statut du Adherent"+a1.getEmpruntEnCours());
		System.out.println("Statut du Adherent"+a1.getEmprentArchiveList());
		
		a1.retour(empruntEnCours1);
		System.out.println(" Affichage apres  le retour");
		System.out.println("Statut du Exemplaire : "+ex1.getStatus());
		System.out.println("Statut du Adherent Emprunt en cours : "+a1.getEmpruntEnCours());
		System.out.println("Statut du Adherent emprunt archive : "+a1.getEmprentArchiveList());
		
		for(int i=0;i<1000;i++)
		{
			new Adherent();
		}
	}
	

}
