package agence;
public class Voyageur extends Personne {

	private String numeroPieceIdentite;
	private int age;
	public Reservation reservation;
	public Voyageur(String civilite, String firstName, String lastName, String email, Adresse adress, String numeroPieceIdentite,
			int age, Reservation reservation) {
		super(civilite, firstName, lastName, email, adress);
		this.numeroPieceIdentite = numeroPieceIdentite;
		this.age = age;
		this.reservation = reservation;
	}
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}
	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
  

}