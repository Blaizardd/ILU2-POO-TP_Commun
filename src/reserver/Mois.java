package reserver;

public class CalendrierAnnuel{
	public CalendrierAnnuel() {
		Mois calendrier [] = new Mois[12];
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[0] = new Mois("Février", 31);
		calendrier[0] = new Mois("Mars", 31);
		calendrier[0] = new Mois("Avril", 31);
		calendrier[0] = new Mois("Mai", 31);
		calendrier[0] = new Mois("Juin", 31);
		calendrier[0] = new Mois("Juillet", 31);
		calendrier[0] = new Mois("Aout", 31);
		calendrier[0] = new Mois("Septembre", 31);
		calendrier[0] = new Mois("Octobre", 31);
		calendrier[0] = new Mois("Novembre", 31);
		calendrier[0] = new Mois("Decmbre", 31);

		
	}
	
	
	
	
	
	
	
	
	public class Mois {
		private String nom;
		private int nbJours;
		private boolean [] jours;
		
		public Mois(String nom, int nbJours) {
			this.nom = nom;
			boolean jours[] = new boolean[nbJours];
		
		
		}
	
		public boolean estLibre(int jour) {
			if (jours[jour-1] == true) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void reserver(int jour) {
			///if (jours[jour-1] == null) {
				//return -1; //FAIRE LE TRY EXCEPT
			//}
			if (estLibre(jour)) {
				jours[jour-1] = false;
			}
			else {
				System.out.println("deso ce jour n'est pas libre");
				//faire l'exception IllegalStateException
			}

	}
	
}
