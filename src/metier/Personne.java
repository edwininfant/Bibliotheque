package metier;

import java.util.Date;

public class Personne {
	
	public Personne(String nom, String prenom, Date dateNaissance, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
	}


	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String sexe;
	

	public Personne() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + ", sexe=" + sexe + "]";
	}

}
