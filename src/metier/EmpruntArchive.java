package metier;

import java.util.Date;

public class EmpruntArchive  {
	
    private Date dateRestitutionEff;
    private Date dateEmprunt;
	
	private Exemplaire  exemplaire;
	private Utilisateur emprunter;
	
	
	
	
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}




	
	public EmpruntArchive(Date dateRestitutionEff, Exemplaire exemplaire,
			Utilisateur emprunter,Date dateEmprunte) {
		super();
		
		this.setExemplaire(exemplaire);
		this.setDateEmprunt(dateEmprunte);
		this.dateRestitutionEff = dateRestitutionEff;
		this.setEmprunter(emprunter);
		this.emprunter = emprunter;
	}

	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}

	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}

	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

	public Utilisateur getEmprunter() {
		return emprunter;
	}

	@Override
	public String toString() {
		return "EmpruntArchive [dateRestitutionEff=" + dateRestitutionEff
				+ ", dateEmprunt=" + dateEmprunt + ", exemplaire=" + exemplaire
				+ ", emprunter=" + emprunter + "]";
	}

	public void setEmprunter(Utilisateur emprunter) {
		this.emprunter = emprunter;
	}

	

	public EmpruntArchive() {
		// TODO Auto-generated constructor stub
	}

}
