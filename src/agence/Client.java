package agence;

public class Client extends Personne {
	public Reservation  myReservation;
    public Facture  myFacture;
    public MoyenPaiement  myMoyenPaiement;
    private String userName; 
    private String passeword;
    
	public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse,
			Reservation myReservation, Facture myFacture, MoyenPaiement myMoyenPaiement) {
		super(civilite, nom, prenom, email, myAdresse);
		this.myReservation = myReservation;
		this.myFacture = myFacture;
		this.myMoyenPaiement = myMoyenPaiement;
	}

	public Reservation getMyReservation() {
		return myReservation;
	}

	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}

	public Facture getMyFacture() {
		return myFacture;
	}

	public void setMyFacture(Facture myFacture) {
		this.myFacture = myFacture;
	}

	public MoyenPaiement getMyMoyenPaiement() {
		return myMoyenPaiement;
	}

	public void setMyMoyenPaiement(MoyenPaiement myMoyenPaiement) {
		this.myMoyenPaiement = myMoyenPaiement;
	}
	

	public boolean authentification(String userName,String passWord) {
		return this.userName.equals(userName) && this.passeword.equals(passWord);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasseword() {
		return passeword;
	}

	public void setPasseword(String passeword) {
		this.passeword = passeword;
	}

}