package agence;

public class PrestationHebergement {
    private Pension pension;
    private double prix;
    
	public PrestationHebergement(Pension pension, double prix) {
		super();
		this.pension = pension;
		this.prix = prix;
	}

	public Pension getPension() {
		return pension;
	}

	public void setPension(Pension pension) {
		this.pension = pension;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}