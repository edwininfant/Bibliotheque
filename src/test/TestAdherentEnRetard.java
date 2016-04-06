package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import exceptions.BiblioException;
import metier.Adherent;
import metier.EmpruntEnCours;
import metier.EnumStatusExemplaire;
import metier.Exemplaire;
import bibliothequesDAO.ExemplairesDao;
import bibliothequesDAO.UtilisateurDAO;

public class TestAdherentEnRetard {
	
public TestAdherentEnRetard() {
		
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
	
	Adherent a1 = (Adherent) uDAO.findByKey(1000);
	
	d2=sdf.parse("15-01-2016");
	System.out.println("Emprunte added to Adherent avec un ancien date 15-01-2016 ");
	EmpruntEnCours empruntEnCours1 = new EmpruntEnCours(a1,ex1,d2);
	EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(a1,ex2,new Date());
	System.out.println("Emprunte added to Adherent avec un ancien date 15-01-2016 ");
	if(a1.isConditionsPretAcceptees())
	{
		a1.addEmpruntEnCours(empruntEnCours2);
	}else{
		try {
			throw new BiblioException("Refus d'Emprunter car L'Adherent déja un ou plusieur emprunts en Retard!!");
		} catch (BiblioException e) {
			
			e.printStackTrace();
		}
	}
	
	ArrayList<EmpruntEnCours> ad1collection,em1collection;
	 ad1collection = a1.getEmpruntEnCours();
	Iterator<EmpruntEnCours> ad_iterator = ad1collection.iterator();
	System.out.println("Emprunts en Cours de l'adhérent 1 :\n-------------------------------");
	while(ad_iterator.hasNext()){
		System.out.println(ad_iterator.next());
	}
	
	}
	

}
