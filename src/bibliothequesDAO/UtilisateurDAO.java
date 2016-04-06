package bibliothequesDAO;

import java.util.ArrayList;
import java.util.Date;

import metier.Adherent;
import metier.Employe;
import metier.EnumCategorieEmploye;
import metier.Utilisateur;

public class UtilisateurDAO {
	
	private static Utilisateur [] UtilisateurDB={
	new Adherent("adherent1_nom","adherent1_prenom",new Date(),"Female", 1000, "adhrent_pwd1", "ahrent1","123456789"),
	new Adherent("adherent2_nom","adherent2_prenom",new Date(),"male", 1001, "adhrent_pwd2", "ahrent2","32658987"),
	new Employe("emp_nom1","emp_prenom1",new Date(),"Male",10000,"pwd_emp1","emp1_pseudo","emp_id1",EnumCategorieEmploye.BIBLIOTHECAIRE),
	new Employe("emp_nom2","emp_prenom2",new Date(),"Female",10001,"pwd_emp2","emp2_pseudo","emp_id2",EnumCategorieEmploye.RESPONSABLE),};
	
	
	ArrayList<Utilisateur> Utilisateur_list = new ArrayList<Utilisateur>();


	
	

	public UtilisateurDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public Utilisateur findByKey(int Id)
	{
		for(Utilisateur u:UtilisateurDB)
		{
			if(u.getIdUtilisateur()==Id)
			{
				return u;
			}
		}
		return null;
	}
	
	public void add(Utilisateur u)
	{
		Utilisateur_list.add(u);
	}

}
