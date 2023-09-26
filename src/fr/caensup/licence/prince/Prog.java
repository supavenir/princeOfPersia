package fr.caensup.licence.prince;

public class Prog {

	public static void main(String[] args) {
		Prince joe=new Prince();
		System.out.println("pv de joe : "+joe.getPointDeVie());
		System.out.println("Epee : "+joe.hasEpee());
		Fiole fMalefique=new Fiole();
		fMalefique.setEffet(false);
		joe.boire(fMalefique);
		System.out.println("pv de joe : "+joe.getPointDeVie());
	}

}
