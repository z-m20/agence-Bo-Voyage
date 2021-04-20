package agence;

import java.util.ArrayList;

public class Formule {
	public double prixTotal;
	public ArrayList<Prestation> prestations;
	
	public Formule(double prixTotal, ArrayList<Prestation> prestations) {
		super();
		this.prixTotal = prixTotal;
		this.prestations = prestations;
	}

}