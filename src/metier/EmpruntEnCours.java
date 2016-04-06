package metier;

import java.util.Date;

import exceptions.BiblioException;

public class EmpruntEnCours {
	
	private Utilisateur emprunter;
	private Exemplaire exemplaire;
	private Date dateEmprunte;
	





	
	
	public Date getDateEmprunte() {
		return dateEmprunte;
	}

	public Utilisateur getEmprunter() {
		return emprunter;
	}







	public void setEmprunter(Utilisateur emprunter) {
		if(emprunter==null)
		{
			this.emprunter=null;
			
		}
		if(emprunter instanceof Adherent)
		{
			if(((Adherent) emprunter).isConditionsPretAcceptees())
			{
		emprunter.addEmpruntEnCours(this);
		this.emprunter=emprunter;
			}else
			{
				try {
					throw new BiblioException("Adherent n'est pas satifée la condition d'emprunte!");
				} catch (BiblioException e) {
					
					e.printStackTrace();
				}
			}
		}
		if(emprunter instanceof Employe)
		{
			emprunter.addEmpruntEnCours(this);
		this.emprunter=emprunter;
			
		}
	}







	public Exemplaire getExemplaire() {
		return exemplaire;
	}







	public void setExemplaire(Exemplaire exemplaire) {
		
		if(exemplaire==null)
		{
			
			this.exemplaire=null;
			
		}
		else if(exemplaire.getStatus()==EnumStatusExemplaire.DISPONIBLE){
			
			this.exemplaire=exemplaire;
			
		    exemplaire.setEmpruntEnCours(this);
		    exemplaire.setStatus(EnumStatusExemplaire.PRETE);
		    
			
		}
	}






	
	@Override
	public String toString() {
		return "EmpruntEnCours [dateEmprunte=" + dateEmprunte + ", emprunter="
				+ emprunter + ", exemplaire=" + exemplaire + "]";
	}







	public EmpruntEnCours() {
		
	}
	
	public EmpruntEnCours( Utilisateur emprunter,Exemplaire exemplaire, Date dateEmprunte) {
		super();
		if(emprunter instanceof Employe||((Adherent) emprunter).isConditionsPretAcceptees()  )
		{
		this.setEmprunter(emprunter); 
		this.setExemplaire(exemplaire);
		this.setDateEmprunte(dateEmprunte);
		}else{
			try {
				throw new BiblioException("Adherent n'est pas satifée la condition d'emprunte!");
			} catch (BiblioException e) {
				
				e.printStackTrace();
			}
		}
	}

	
	



	public void setDateEmprunte(Date dateEmprunte) {
		this.dateEmprunte = dateEmprunte;
	}


	
	
	




}
