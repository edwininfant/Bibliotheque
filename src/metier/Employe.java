package metier;

import java.util.Date;

public class Employe extends Utilisateur {
	public Employe(String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super();
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
	}

	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;

	public String getCodeMatricule() {
		return codeMatricule;
	}

	public Employe(String nom, String prenom, Date dateNaissance, String sexe,
			int idUtilisateur, String pwd, String pseudonyme,
			String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
	}

	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}

	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}

	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employe [codeMatricule=" + codeMatricule
				+ ", categorieEmploye=" + categorieEmploye +  ", getIdUtilisateur()=" + getIdUtilisateur() + ", getPwd()="
				+ getPwd() + ", getPseudonyme()=" + getPseudonyme()
				+ ", toString()=" + super.toString() + ", getNbEmpruntEnCours()="
				+ getNbEmpruntEnCours()+"]";
	}

}
