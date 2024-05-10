public class FCargo extends Fusee {
    
    String typeC;
    double poidsC;
    
    	// constructeur de la classe FCargo héritant de la classe fusée (avec toutes les caractéritiques)
	
	public FCargo(String prmtypeC, double prmpoidsC) {
		this.typeC = prmtypeC;
        this.poidsC = prmpoidsC;
		System.out.println("Appel du constructeur FCargo("+this.typeC + " " + this.poidsC +")");
		// cela affiche les valeurs de l'objet qui vient d'être crée 
	}

	// Constructeur vide de FCargo :

    public FCargo(){
        this.typeC = "vétements";
        this.poidsC = 30.3;
    }

    // methode decollage qui prend en compte les caractaires spéciaux de la classe Fusee

    public void Decollage(){
		double hauteurFusee;
        masseVide += poidsC;
		double duree = this.qteCarburant / this.qteCarburant;
		hauteurFusee = (this.pousse * duree * duree * 100)*(this.masseVide + this.qteCarburant);
		this.position = hauteurFusee;

		String unMessage = "";  
		unMessage += "\n \n \n ----------------------------------------------------------------------";
		unMessage += "\n SATURN_5 décolle dans 3, 2, 1 .....";
		unMessage += "\n FUUIIIUUIUUUUUUUUUU";
		unMessage += "\n La hauteur de la fusée est de " + this.position;
		unMessage += "\n ----------------------------------------------------------------------";

		System.out.println(unMessage);
    }
}
