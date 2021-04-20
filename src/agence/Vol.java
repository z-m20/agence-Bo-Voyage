package agence;

import java.util.Date;

public class Vol extends Prestation {
	private String aeroport;
	private String compagnie;
	public Vol(Date dateDepart, Date dateArrivee, double prixHT, String aeroport, String compagnie) {
		super(dateDepart, dateArrivee, prixHT);
		this.aeroport = aeroport;
		this.compagnie = compagnie;
	}
	
}