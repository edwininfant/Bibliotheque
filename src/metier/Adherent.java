package metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

import exceptions.BiblioException;

public class Adherent extends Utilisateur {
	
	@Override
	public String toString() {
		return "Adherent [telephone=" + telephone + ", nbMaxPrets="
				+ nbMaxPrets + ", dureeMaxPrets=" + dureeMaxPrets
				+ ", getIdUtilisateur()=" + getIdUtilisateur() + ", getPwd()="
				+ getPwd() + ", getPseudonyme()=" + getPseudonyme()
				+ ", toString()=" + super.toString() + ", getNbEmpruntEnCours()="
				+ getNbEmpruntEnCours()+"]";
	}

	private String  telephone;
	
	private final int  nbMaxPrets=3;
	private final int dureeMaxPrets=15;

	


	



	public Adherent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adherent(String nom, String prenom, Date dateNaissance, String sexe,
			int idUtilisateur, String pwd, String pseudonyme,String telephone) {
	
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.telephone=telephone;
		// TODO Auto-generated constructor stub
	}
	 public void addEmpruntEnCours(EmpruntEnCours ep) 
	   {
		 if(this.isConditionsPretAcceptees()){
			 super.addEmpruntEnCours(ep);
		 }else{
			 try {
				throw new BiblioException("Emprunte refusée");
			} catch (BiblioException e) {
				
				e.printStackTrace();
			}
		 }
	   }
	

	public boolean isConditionsPretAcceptees()
	{
		if(this.getNbRetards()>0)
		{
			System.out.println("no of retards:  "+this.getNbRetards());
		return false;
		}
		if(this.getNbEmpruntEnCours()>=nbMaxPrets)
		{
			System.out.println("Nb of emprunts en Cours :  "+this.getNbEmpruntEnCours());
			return false;
		}
		return true;
	}

	public int getNbRetards()
	{
		int count = 0;
		long diff ;
		EmpruntEnCours em;
		Date emp_Date;
		if(this.getNbEmpruntEnCours()>0)
		{
	ArrayList<EmpruntEnCours> list	= this.getEmpruntEnCours();
	Date today = new Date();
	 Iterator<EmpruntEnCours> it = list.iterator();
	 while(it.hasNext())
	 {
		em=  it.next();
	emp_Date =em.getDateEmprunte();
	
	diff = ((today.getTime()-emp_Date.getTime())/(24*60*60*1000));
		 if(diff>dureeMaxPrets)
		 {
			 count++;
		 }
		 
	 }
		}else
		{
			return 0;
		}
		return count;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getNbMaxPrets() {
		return nbMaxPrets;
	}

	public int getDureeMaxPrets() {
		return dureeMaxPrets;
	}
	
}
