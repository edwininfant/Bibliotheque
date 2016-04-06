package test;

import java.util.Date;

import metier.EnumStatusExemplaire;
import metier.Exemplaire;
import bibliothequesDAO.ExemplairesDao;

public class ExemplaireTest {
	


	public ExemplaireTest() {
		// TODO Auto-generated constructor stub
	}
    
	public static void main(String args[])
	{
	
		
	ExemplairesDao test = new ExemplairesDao();
	
	System.out.println(" Voice le Exemplaire du Id : 1");
	System.out.println(test.findByKey(1));
	System.out.println("------------------------------");
	System.out.println(" Voice le Exemplaire du Id : 2");
	System.out.println(test.findByKey(2));
		
		
	}


}
