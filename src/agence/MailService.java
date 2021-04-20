package agence;

public class MailService {
	Client client;
  	Reservation reservation;
	public MailService(Client client, Reservation reservation) {
		this.client = client;
		this.reservation = reservation;
	}
  
}