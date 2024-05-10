public class  FAstronaute extends FCargo  {

    String nomA;
    String prenomA;
    int ageA;
    double poidsA;
    String sexe;
    

    	// constructeur de la  la classe FAstronaute héritant de la classe fusée (avec toutes les caractéritiques)
	
	public FAstronaute(String prmnomA, String prmprenomA, int prmageA, double prmpoidsA, String prmsexe) {
        this.nomA = prmnomA;
        this.prenomA = prmprenomA;
        this.ageA = prmageA;
        this.poidsA = prmpoidsA;
        this.sexe = prmsexe;   

        System.out.println("Appel du constructeur FAstronaute("+this.nomA + " , " + this.prenomA + " , "+  this.ageA + " , " + this.poidsA + " , " + this.sexe + ")");

		// cela affiche les valeurs de l'objet qui vient d'être crée  
	}

	// Constructeur vide de FCargo :

    public FAstronaute(){
		this.nomA = "Perart";
        this.prenomA = "Olivier";
        this.ageA = 75;
        this.poidsA = 74;
        this.sexe = "homme";
    }

	// Methode afficher Astronnaute

	public void Afficher() {		       
            String unAstronnaute="";
            unAstronnaute += "\n ----------------------------------------------------------------------";
            unAstronnaute += "\n Le nom de l'astronnaute est : "+ this.nomA  + ".";
            unAstronnaute += "\n Il se prénome : " + this.prenomA + ".";
            unAstronnaute += "\n L'astronnaute est un : " + this.sexe + ".";
            unAstronnaute += "\n L'astronnaute à : " + this.ageA + " ans.";
            unAstronnaute += "\n L'astronnaute pèse : "+ this.poidsA + " killogrammes.";
            unAstronnaute += "\n ----------------------------------------------------------------------";
		    System.out.println(unAstronnaute);
	}

    // methode decollage qui prend en compte les caractéristiques spéciaux de la classe Astronnaute

    public void Decollage(){
		double hauteurFusee;
        masseVide += this.poidsA;
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

        // methode embarquement des Astronnautes

    public void EmbarquementA (){
        String unMessage = "";
        unMessage = "\n -------------------------------------------------------";
        unMessage += "\n Les Astronnautes ont embarquées dans la fusée";
        unMessage = "\n -------------------------------------------------------";

        this.masseVide += poidsA;

    }
}