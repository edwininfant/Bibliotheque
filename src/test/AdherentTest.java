package test;

import java.util.Date;

import metier.Employe;
import metier.EnumCategorieEmploye;
import metier.Utilisateur;
import bibliothequesDAO.UtilisateurDAO;

public class AdherentTest {

	public AdherentTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilisateurDAO uDAO = new UtilisateurDAO();
		
		Utilisateur u1 = new Utilisateur("adherent1_nom","adherent1_prenom",new Date(),"Female", 1000, "adhrent_pwd1", "ahrent1");
		Utilisateur u2 = new Utilisateur("adherent2_nom","adherent2_prenom",new Date(),"male", 1001, "adhrent_pwd2", "ahrent2");
		uDAO.add(u1);
		uDAO.add(u2);
		System.out.println(" Find By Adherent  Id : 1000");
		System.out.println(uDAO.findByKey(1000));
		System.out.println("------------------------------");
		System.out.println(" Find By Adherent  Id : 1001");
		System.out.println(uDAO.findByKey(1001));
		System.out.println("------------------------------");
		
		Employe e1 = new Employe("emp_nom1","emp_prenom1",new Date(),"Male",10000,"pwd_emp1","emp1_pseudo","emp_id1",EnumCategorieEmploye.BIBLIOTHECAIRE);
		Employe e2 = new Employe("emp_nom2","emp_prenom2",new Date(),"Female",10001,"pwd_emp2","emp2_pseudo","emp_id2",EnumCategorieEmploye.RESPONSABLE);

		uDAO.add(e1);
		uDAO.add(e2);
		System.out.println(" Find By Employee  Id : 10000");
		System.out.println(uDAO.findByKey(10000));
		System.out.println("------------------------------");
		System.out.println(" Find By Employee   Id : 10001");
		System.out.println(uDAO.findByKey(10001));
		System.out.println("------------------------------");
	}

}
