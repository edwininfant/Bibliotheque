package bibliothequesDAO;

import java.util.Date;

import metier.EnumStatusExemplaire;
import metier.Exemplaire;

public class ExemplairesDao {
	

	public ExemplairesDao() {
		// TODO Auto-generated constructor stub
	}
	
	public static Exemplaire[] getExemplaireDB() {
		return exemplaireDB;
	}

	private static  Exemplaire [] exemplaireDB = {
		
		new Exemplaire(1,new Date(),EnumStatusExemplaire.DISPONIBLE,"11111111"),
		new Exemplaire(2,new Date(),EnumStatusExemplaire.DISPONIBLE,"22222222"),
		new Exemplaire(3,new Date(),EnumStatusExemplaire.DISPONIBLE,"33333333"),
		new Exemplaire(4,new Date(),EnumStatusExemplaire.DISPONIBLE,"44444444")
		
	};
	
	public Exemplaire findByKey(int id)
	{
		for(Exemplaire exemplaire:exemplaireDB)
		{
			if(exemplaire.getIdExemplaire()==id)
			{
				return exemplaire;
			}
			
		}
		return null;
	}
	
}
