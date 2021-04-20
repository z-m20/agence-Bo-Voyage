package agence;

import java.util.Date;

public class Voiture extends Prestation {
	private int typeVoiture;
	public Voiture(Date dateDepart, Date dateArrivee, double prixHT, int typeVoiture) {
		super(dateDepart, dateArrivee, prixHT);
		this.typeVoiture = typeVoiture;
	}
}