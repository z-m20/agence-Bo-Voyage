package agence;

public class Facture {
    private Client  myClient;
    private Reservation myReservation;
    
	public Facture(Client myClient, Reservation myReservation) {
		super();
		this.myClient = myClient;
		this.myReservation = myReservation;
	}
	
	public Client getMyClient() {
		return myClient;
	}
	public void setMyClient(Client myClient) {
		this.myClient = myClient;
	}
	public Reservation getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}
}