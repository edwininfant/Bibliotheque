package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import metier.Adherent;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.EnumStatusExemplaire;
import metier.Exemplaire;
import bibliothequesDAO.ExemplairesDao;
import bibliothequesDAO.UtilisateurDAO;

public class TestEmployeTroisEmprunts {

	public TestEmployeTroisEmprunts() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		Date d1,d2;
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
				
			
				 d1 = sdf.parse("15-01-2000");
				new Exemplaire(1,d1,EnumStatusExemplaire.DISPONIBLE,"11111111");
			ExemplairesDao exemplaireDAO = new ExemplairesDao();
			Exemplaire ex1,ex2,ex3,ex4;
			ex1=exemplaireDAO.findByKey(1);
			ex2=exemplaireDAO.findByKey(2);
			
			ex3=exemplaireDAO.findByKey(3);
			
			ex4=exemplaireDAO.findByKey(4);
			
			UtilisateurDAO uDAO = new UtilisateurDAO();
			
			
			Employe e1 = (Employe) uDAO.findByKey(10000);
			
			
			
			EmpruntEnCours empruntEnCours1 = new EmpruntEnCours(e1,ex1,new Date());
			System.out.println(" premeiere emprunte pour l employee");
			e1.addEmpruntEnCours(empruntEnCours1);
			
			EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(e1,ex2,new Date());
			System.out.println(" Deuxieme emprunte pour l employee");
			e1.addEmpruntEnCours(empruntEnCours2);
			
			EmpruntEnCours empruntEnCours3 = new EmpruntEnCours(e1,ex3,new Date());
			System.out.println(" Troisieme emprunte pour l employee");
			e1.addEmpruntEnCours(empruntEnCours3);
			
			EmpruntEnCours empruntEnCours4 = new EmpruntEnCours(e1,ex4,new Date());
			System.out.println("4 eme emprunte pour l Employee");
			e1.addEmpruntEnCours(empruntEnCours4);
				
			
			
			
			ArrayList<EmpruntEnCours> ad1collection,em1collection;
			 ad1collection = e1.getEmpruntEnCours();
			Iterator<EmpruntEnCours> ad_iterator = ad1collection.iterator();
			System.out.println("Emprunts en Cours de Employee 1 :\n-------------------------------");
			while(ad_iterator.hasNext()){
				System.out.println(ad_iterator.next());
			}
			
				

			}

}
