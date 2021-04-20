package agence;

import java.util.Date;

public class CB extends MoyenPaiement {
  private long numeroCB;
  private Date dateExpiration;
  public CB() {
	  
  }
  
  public CB(long l, Date dateExpiration) {
	this.numeroCB = l;
	this.dateExpiration = dateExpiration;
  }

	public long getNumeroCB() {
		return numeroCB;
	}
	
	public void setNumeroCB(long numeroCB) throws Exception {
		if(this.checkIsCorrectedCbNumber(numeroCB)) this.numeroCB = numeroCB;
		else throw new Exception("Not correct CB number");
	}
	
	public Date getDateExpiration() {
		return dateExpiration;
	}
	
	public void setDateExpiration(Date dateExpiration) throws Exception {
		if(this.checkIsCbNotExpired(dateExpiration)) this.dateExpiration = dateExpiration;
		else throw new Exception("Date non valide : ");
	}

	public boolean checkIsCorrectedCbNumber(long cbNumber) {
		// to be completed 
		return true;
	}
	
	public boolean checkIsCbNotExpired(Date date) {
		if( new Date().after(date) ) return false;
		return true;
	}
}