package metier;

import java.util.Date;

public class Exemplaire {

	private int  idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	private EmpruntEnCours empruntEnCours;

	
	
	public Exemplaire(int idExemplaire, Date dateAchat,
			EnumStatusExemplaire status, String isbn) {
		super();
		this.setDateAchat(dateAchat);
		this.setIsbn(isbn);
		this.setIdExemplaire(idExemplaire);
		this.setStatus(EnumStatusExemplaire.DISPONIBLE);
		this.setEmpruntEnCours(null);
	}
	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}
	public EmpruntEnCours getEmpruntEnCours() {
		return empruntEnCours;
	}
	public int getIdExemplaire() {
		return idExemplaire;
	}
	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public EnumStatusExemplaire getStatus() {
		return status;
	}
	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Exemplaire() {
		
	}
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ",isbn=" + isbn + "]";
	}

}
