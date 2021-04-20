package agence;

import java.util.ArrayList;

public class Voyage {

	private int numeroVoyage;
	private Boolean statut;
	public double prix;
	public Formule formule;
	public ArrayList<Reservation>  reservations;
	private Destination destination;
	
	public Voyage(int numeroVoyage, Boolean statut, double prix, Formule formule, ArrayList<Reservation> reservations,
			Destination destination) {
		this.numeroVoyage = numeroVoyage;
		this.statut = statut;
		this.prix = prix;
		this.formule = formule;
		this.reservations = reservations;
		this.destination = destination;
	}

	public int getNumeroVoyage() {
		return numeroVoyage;
	}

	public void setNumeroVoyage(int numeroVoyage) {
		this.numeroVoyage = numeroVoyage;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	

}