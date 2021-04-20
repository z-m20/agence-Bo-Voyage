package agence;

public abstract class Assurance {
	public double prixAssurance;
    public Contrat  contrat;
    public Reservation  reservation;
	public Assurance(double prixAssurance, Contrat contrat, Reservation reservation) {
		this.prixAssurance = prixAssurance;
		this.contrat = contrat;
		this.reservation = reservation;
	}
	public double getPrixAssurance() {
		return prixAssurance;
	}
	public void setPrixAssurance(double prixAssurance) {
		this.prixAssurance = prixAssurance;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
    
}