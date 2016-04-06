package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import metier.Employe;
import metier.EmpruntEnCours;
import metier.EnumStatusExemplaire;
import metier.Exemplaire;
import bibliothequesDAO.ExemplairesDao;
import bibliothequesDAO.UtilisateurDAO;

public class TestEmployeEnRetard {

	public TestEmployeEnRetard() {
		
	}

	public static void main(String[] args) throws ParseException {
Date d1,d2;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		d1 = sdf.parse("15-01-2000");
		
		new Exemplaire(1,d1,EnumStatusExemplaire.DISPONIBLE,"11111111");
	    ExemplairesDao exemplaireDAO = new ExemplairesDao();
	    Exemplaire ex1,ex2;
	    ex1=exemplaireDAO.findByKey(1);
	    ex2=exemplaireDAO.findByKey(2);
	
	UtilisateurDAO uDAO = new UtilisateurDAO();
	Employe e1 = (Employe) uDAO.findByKey(10000);
	d2=sdf.parse("15-01-2016");
	System.out.println("Emprunte added to Adherent avec un ancien date 15-01-2016 ");
	EmpruntEnCours empruntEnCours1 = new EmpruntEnCours(e1,ex1,d2);
	e1.addEmpruntEnCours(empruntEnCours1);
	EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(e1,ex2,new Date());
	e1.addEmpruntEnCours(empruntEnCours2);
	ArrayList<EmpruntEnCours> emp1collection;
	 emp1collection = e1.getEmpruntEnCours();
	Iterator<EmpruntEnCours> emp_iterator = emp1collection.iterator();
	System.out.println("Emprunts en Cours de Employee 1 :\n-------------------------------");
	while(emp_iterator.hasNext()){
		System.out.println(emp_iterator.next());
	}

	}

}
