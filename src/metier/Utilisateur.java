package metier;

import java.util.ArrayList;
import java.util.Date;

public class Utilisateur extends Personne {
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	ArrayList<EmpruntEnCours> emprentEnCoursList = new ArrayList<EmpruntEnCours>();
	ArrayList<EmpruntArchive> emprentArchiveList = new ArrayList<EmpruntArchive>();
	
	public Utilisateur(String nom, String prenom, Date dateNaissance,
			String sexe, int idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}
	

	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}




	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}




	public String getPwd() {
		return pwd;
	}




	public void setPwd(String pwd) {
		this.pwd = pwd;
	}




	public String getPseudonyme() {
		return pseudonyme;
	}




	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}





	
	
	
	

	




	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", pwd=" + pwd
				+ ", pseudonyme=" + pseudonyme + ", NbEmpruntEnCours()="
				+ getNbEmpruntEnCours() + "]";
	}


	public void addEmpruntEnCours(EmpruntEnCours emprunt )
	{
		if(emprentEnCoursList.contains(emprunt)==false)
		{
	
			emprentEnCoursList.add(emprunt);
	
			
		}
		
	}
	
	public void retour(EmpruntEnCours empcours)
	{
	//	this.addEmpruntArchive(new EmpruntArchive(new Date(),empcours.getExemplaire(),empcours.getEmprunter()));
		emprentArchiveList.add(new EmpruntArchive(new Date(),empcours.getExemplaire(),empcours.getEmprunter(),empcours.getDateEmprunte()));
		empcours.getExemplaire().setEmpruntEnCours(null);
		this.removeEmpruntEnCours(empcours);
		empcours.getExemplaire().setStatus(EnumStatusExemplaire.DISPONIBLE);
		empcours.setExemplaire(null);
		empcours.setEmprunter(null);
		empcours.setDateEmprunte(null);
		
	}
	public void addEmpruntArchive(EmpruntArchive emprunt )
	{
		if(emprentArchiveList.contains(emprunt)==false)
		{
	
			emprentArchiveList.add(emprunt);
	
			
		}
		
	}
	
	public void removeEmpruntEnCours(EmpruntEnCours emprunt )
	{
		if(emprentEnCoursList.contains(emprunt)==true)
		{
			
		 
			System.out.println("Empruntelist  deleted  succesfully");
			emprentEnCoursList.remove(emprunt);
	
			
		}
		
	}
	public ArrayList<EmpruntEnCours> getEmpruntEnCours()
	{
		
		return emprentEnCoursList;
		
	}
	public ArrayList<EmpruntArchive> getEmprentArchiveList() {
		return emprentArchiveList;
	}


	public void setEmprentArchiveList(ArrayList<EmpruntArchive> emprentArchiveList) {
		this.emprentArchiveList = emprentArchiveList;
	}


	public int getNbEmpruntEnCours()
	{
		return emprentEnCoursList.size();
	}

}
