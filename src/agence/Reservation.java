package agence;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Reservation {
   private ArrayList<Voyageur> listeVoyageur;
   private int numeroReservation;
   private EtatsReservation etatReservation;
   public Client  client;
   public Assurance  assurance;
   public Voyage voyage;
   final int NBRESSAIS = 5;
   final double PRIX_ASSURANCE = 8;
   Scanner sc = new Scanner(System.in);
   /*
   enum errors{
	   NO_ERRORS,
	   INVALID_CB_DATE,
	   INVALID_CB_NUMBER;
   }*/
   
   

   public Reservation(ArrayList<Voyageur> listeVoyageur, int numeroReservation, EtatsReservation etatReservation,
		Client client, Voyageur voyageur, Assurance assurance, Voyage voyage) {
	this.listeVoyageur = listeVoyageur;
	this.numeroReservation = numeroReservation;
	this.etatReservation = etatReservation;
	this.client = client;
	this.assurance = assurance;
	this.voyage = voyage;
   }
   public Reservation(ArrayList<Voyageur> listeVoyageur, int numeroReservation, EtatsReservation etatReservation,
		Client client, Voyageur voyageur, Voyage voyage) {
	this.listeVoyageur = listeVoyageur;
	this.numeroReservation = numeroReservation;
	this.etatReservation = etatReservation;
	this.assurance = null;
	this.client = client;
	this.voyage = voyage;
   }
   
	public ArrayList<Voyageur> getListeVoyageur() {
		return listeVoyageur;
	}
	
	public void setListeVoyageur(ArrayList<Voyageur> listeVoyageur) {
		this.listeVoyageur = listeVoyageur;
	}
	
	public int getNumeroReservation() {
		return numeroReservation;
	}
	
	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}
	
	public EtatsReservation getEtatReservation() {
		return etatReservation;
	}
	
	public void setEtatReservation(EtatsReservation etatReservation) {
		this.etatReservation = etatReservation;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Assurance getAssurance() {
		return assurance;
	}
	
	
	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}
	
	public Voyage getVoyage() {
		return voyage;
	}
	
	
	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}
	
	void addVoyageur(boolean isClientVoyageur) {
		System.out.print("Enter votre numero d'identifiant ");
		String numeroPieceIdentite = sc.next();
		System.out.print("Enter the age ");
		int age = sc.nextInt();
		Voyageur v;
		if(! isClientVoyageur ) {
			System.out.print("Enter the name of the user");
			String firstName = sc.next();
			System.out.print("Enter the last name of the user");
			String lastName = sc.next();
			System.out.print("Enter the civility : Male ou Female");
			String civilite = sc.next();
			System.out.print("Enter votre mail");// verify if it's mail 
			String mail = sc.next();
			System.out.print("Enter votre numero adresse : rue, ville, codePostal, pays, region ");
			Adresse adress = new Adresse(sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
			v = new Voyageur(civilite, firstName, lastName, mail, adress, numeroPieceIdentite, age, this);
		}
		v = new Voyageur(client.civilite,client.nom,client.prenom, client.email, client.adress, numeroPieceIdentite, age, this);
		listeVoyageur.add(v);
	}
	
	int addAllVoyageurs() throws Exception {
		System.out.print("faites-vous partie des voyageurs ? : true ou false");
		Boolean isClientVoyageur = sc.nextBoolean();
		if (isClientVoyageur) addVoyageur(sc,true);
		System.out.print("Veuillez entrez le nbrDeVoyageur sans vous");
		int nbrVoyageurs = sc.nextInt();
		if( nbrVoyageurs < 0 || ( nbrVoyageurs == 0 && !isClientVoyageur)) throw new Exception("Vous devez spécifier au moins une personne qui prendra le voyage. ");
		while(nbrVoyageurs>0) {
			nbrVoyageurs--;
			addVoyageur(sc,false);
		}
		if(isClientVoyageur) return nbrVoyageurs+1;
		return nbrVoyageurs;
	}
	
	int authentifier(Client client, int nbrEssais) throws NbrEssaiDepasseException {
		System.out.print("entrer votre nom user et mot de passe");
		while( nbrEssais >0 && !client.authentification(sc.next(), sc.next())) nbrEssais--;
		if (nbrEssais == 0 ) throw new NbrEssaiDepasseException("Nbr essais dépassé : ");
		return 0;
	}
	
	Boolean subscribeAssuranceAnnulation() {
		System.out.print("voulez-vous souscrire une assurance annulation ?");
	    Boolean IsAssuranceAnnulationSubscribeds = sc.nextBoolean();
	    if (IsAssuranceAnnulationSubscribeds) {
	    	Contrat contrat = new Contrat();
	    	assurance = new AssuranceAnnulation(PRIX_ASSURANCE, contrat, this);	
	    }
	    return IsAssuranceAnnulationSubscribeds;
	}

	public boolean checkIsCorrectedCbNumber(long cbNumber) {
		// to be completed 
		return true;
	}
	
	public boolean checkIsCbNotExpired(Date date) {
		if( new Date().after(date) ) return false;
		return true;
	}

	
	CB addCB() throws Exception {
		System.out.print("voulez-vous payer par cb ou par chèque ? true : cb, false : cheque" );
		Boolean iSPayementWithCB = sc.hasNextBoolean();
		if(iSPayementWithCB) return null;
		System.out.println("dd-mm-yyyy");
		String date= sc.nextLine();
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
		if(! this.checkIsCbNotExpired(format.parse(date))) {
			etatReservation = etatReservation.Refusee;
			throw new Exception("Date non valide");
		}
		
		System.out.print("Veuillez entrer le numéro de la carte bancaire");
		long numeroCB = sc.nextLong();
		if(! this.checkIsCorrectedCbNumber(numeroCB)) {
			etatReservation = etatReservation.Refusee;
			throw new Exception("Not correct CB number");
		}
		
		CB cb = new CB(numeroCB, format.parse(date));
		return cb;	
		
	}
	
	public void {
		AgenceVoyageService = new AgenceVoyageService();
		
	}

	
	public void reserver(Client client) {
	  try {
			authentifier(client,NBRESSAIS);
			
			int nbrVoyageurs = addAllVoyageurs();
			etatReservation = etatReservation.EnAttente;
			subscribeAssuranceAnnulation();
			voyage.prix += this.assurance.prixAssurance * nbrVoyageurs;
			CB cb =addCB();
			// fct payer : contacter la banque pour verifier la solvabilite

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}