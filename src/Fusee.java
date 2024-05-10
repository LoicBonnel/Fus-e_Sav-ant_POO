import java.util.ArrayList; // -->  Bibliotheque qui permet de créer des array listes en java
import java.util.Collection;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public abstract class  Fusee {	// on rajoute abstratct à la classe 
	
	String nom;
	double masseVide;
	double pousse;
	double qteCarburant;
	double consCarburant;
	double position;
	int version = 1;
	Collection <FAstronaute> Equipage =  new ArrayList<FAstronaute>();
	Collection <FCargo> Marchandise =  new ArrayList<FCargo>();
	double gravite = 1;
	String astre = "Terre";

	// constructeur de la fusée prenant en paramètres toutes les caractèristiques
	

	public Fusee(String prmnom, double prmmasseVide, double prmpousse, double prmqteCarburant, double prmconsCarburant, double prmposition, double prmgravite, String prmastre) {
		this.nom = prmnom;
		this.masseVide = prmmasseVide;
		this.pousse = prmpousse;
		this.qteCarburant = prmqteCarburant;
		this.consCarburant = prmconsCarburant;
		this.position = prmposition;
		this.version = 1;
		this.gravite = prmgravite;
		this.astre = prmastre;
		System.out.println("Appel du constructeur Fusee("+this.nom + " " + this.version + " , "+this.masseVide+" , "+this.pousse+" , "+ this.qteCarburant+" , "+this.consCarburant+" , "+this.position+", "+this.gravite+", "+this.astre+")");
		// cela affiche les valeurs de l'objet qui vient d'être crée 
	}

	// Constructeur vide de la fusée :

	public Fusee() {
		this.nom = "Fusée Prédéfinis";
		this.masseVide = 200000;
		this.pousse = 300000;
		this.qteCarburant = 35000;
		this.consCarburant = 30;
		this.position = 74000;
		this.version = 1;
		this.gravite = 1;
		this.astre = "Neptume";
	}

	// Constructeur qui prend les valeurs de l'objet de type Fusee

	public Fusee (Fusee prmfusee) {
		this.version += 1;
		this.nom = prmfusee.nom + " " + this.version;
		this.masseVide = prmfusee.masseVide;
		this.pousse = prmfusee.pousse;
		this.qteCarburant = prmfusee.qteCarburant;
		this.consCarburant = prmfusee.consCarburant;
		this.position = prmfusee.position;
		this.version = prmfusee.version;
		this.astre = prmfusee.astre;
		this.gravite = prmfusee.gravite;
		}

	// Methode afficher fusée

	public void Afficher() {		
		String unMessage="";      
		unMessage += "\n ----------------------------------------------------------------------";
		unMessage += "\n Le nom de la fusée est : "+ this.nom  + ".";
		unMessage += "\n La masse vide de la fusée est de : " + this.masseVide + " kilogrammes.";
		unMessage += "\n La poussé est de : "+ this.pousse + " Newton.";
		unMessage += "\n La quantité de carburant est de : " + this.qteCarburant + " Littres.";
		unMessage += "\n La consommation de carburant est de : " + this.consCarburant + " Littres.";
		unMessage += "\n La hauteur en metres actuelle de la fusée est de : " + this.position + " mettres.";
		unMessage += "\n L'astre visé est la : " + this.astre + " la gravité sur celui-ci est de : "+this.gravite + " .";
		unMessage += "\n ----------------------------------------------------------------------";

		System.out.println(unMessage);
	}
	
	// Méthode décollage fusée 

	public abstract void Decollage(); /* {
		
		double hauteurFusee;
		double duree = this.qteCarburant / this.qteCarburant;
		hauteurFusee = (this.pousse * duree * duree * 100)/(this.masseVide + this.qteCarburant)/this.gravite ;
		this.position = hauteurFusee;

		String unMessage = "";  
		unMessage += "\n \n \n ----------------------------------------------------------------------";
		unMessage += "\n SATURN_5 décolle dans 3, 2, 1 .....";
		unMessage += "\n FUUIIIUUIUUUUUUUUUU";
		unMessage += "\n La hauteur de la fusée est de " + this.position;
		unMessage += "\n ----------------------------------------------------------------------";
		System.out.println(unMessage);
	} */

	// méthode embarquer astronnaute

	public void EmbarquerAstronaute(FAstronaute prmAstronaute){
		this.Equipage.add(prmAstronaute);
		System.out.println (prmAstronaute.prenomA + " à rejoint l'équipage.");
    	System.out.println("La fusée " + Fusee.this.nom + " contient actuellement : " + Equipage.size() + " astronnautes.");
	}

		// méthode charger marchndise

	public void ChargerMarchandise(FCargo prmMCargo){

		this.Marchandise.add(prmMCargo);
		System.out.println ("La marchandise " + prmMCargo.typeC + " viens d'être charger dans la navette " + Fusee.this.nom);
	}
}