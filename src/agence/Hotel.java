package agence;

import java.util.ArrayList;
import java.util.Date;

public class Hotel extends Prestation {
	public String nomHotel;
	private int nbEtoiles;
	private ArrayList<Chambre> mesChambres;
	private Adresse adresse;
	
	public Hotel(Date dateDepart, Date dateArrivee, double prixHT, String nomHotel, int nbEtoiles,
			ArrayList<Chambre> mesChambres, Adresse adresse) {
		super(dateDepart, dateArrivee, prixHT);
		this.nomHotel = nomHotel;
		this.nbEtoiles = nbEtoiles;
		this.mesChambres = mesChambres;
		this.adresse = adresse;
	}
}