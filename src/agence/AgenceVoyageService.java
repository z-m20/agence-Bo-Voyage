package agence;

public class AgenceVoyageService {
	private String nomAgence;

	public AgenceVoyageService(String nomAgence) {
		super();
		this.nomAgence = nomAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	
}