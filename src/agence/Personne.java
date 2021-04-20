package agence;

public abstract class Personne {
	protected String civilite;
	protected String nom;
	protected String prenom;
	protected String email;
	protected Adresse  adress;
	
	public Personne(String civilite, String nom, String prenom, String email, Adresse adress) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adress = adress;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getMyAdresse() {
		return adress;
	}

	public void setMyAdresse(Adresse myAdresse) {
		this.adress = myAdresse;
	}
	

}