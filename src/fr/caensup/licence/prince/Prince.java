package fr.caensup.licence.prince;

public class Prince {
	private int pointDeVie;
	private boolean epee;
	
	public Prince() {
		this.pointDeVie=3;
		this.epee=false;
	}
	
	public int getPointDeVie() {
		return this.pointDeVie;
	}
	
	public boolean hasEpee() {
		return this.epee;
	}
	
	public void boire(Fiole fiole) {
		this.pointDeVie=this.pointDeVie+fiole.getEffetPv();
	}
	
	
}












