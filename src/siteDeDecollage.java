public class siteDeDecollage {
public static void main(String[] args) {

//	Fusee SATURN_V = new Fusee("SATURN V",150000.0,200000.0,7800.0, 23.0, 6200.0, 0.16,  "Lune"  );

	 // Afficher les caractèristique de la fusée SATURN_5 :

	// SATURN_V.Afficher();

	 // Faire décoller la fusée SATURN_5 :

//	 SATURN_V.Decollage();

	 // créer la fusée SATURN_5_V2 avec les paramteres de la fusée SATURN_5 :

 // Fusee SATURN_V2 = new Fusee(SATURN_V);

	// Afficher les caractèristique de la fusée SATURN_5_V2 :

//	SATURN_V2.Afficher();

	// On créer des objets astronnautes :
/*
	FAstronaute Boquet = new FAstronaute ("Boquet", "Le Viking", 42, 115, "homme");
	FAstronaute Humez = new FAstronaute ("Mister Yumezzzz", "Apple man", 49, 86.3, "homme");
	FAstronaute Saveant = new FAstronaute ("Tsave", "Pimousse", 25, 64.3, "homme");

	// On créer un objet cargaison :

	// FCargo Satellite = new FCargo("satellite", 3000);

	// Afficher les informations sur un astronautes :

	Boquet.Afficher();

	// Methode pour embarquer un astronnaute :

//	SATURN_V.EmbarquerAstronaute(Boquet);
//	SATURN_V.EmbarquerAstronaute(Humez);
//	SATURN_V.EmbarquerAstronaute(Saveant);

	// Methode pour embarquer une cargaison :

//	SATURN_V2.ChargerMarchandise(Satellite);


//	SATURN_V.Decollage();
//	SATURN_V2.Decollage();

	// Exercise numéro 5 :

	A monA = new A();
	B monB = new B();
	monA.puba = 1;
	monA.proa = 2;
	monA.pria = 3;

	monB.puba = 1;
	monB.proa = 2;
	monB.pria = 3;
	
	monA.affiche();

	// exercise numéro 6 :

//	SATURN_V.Decollage();
//	SATURN_V2.Decollage();

	// exercise numéro 7 :

	
	FCargo Pain = new FCargo("nourriture", 20);
	FCargo PapierToilette = new FCargo("produit ménagée", 30);
	FCargo vetements = new FCargo("vetements", 46);
	FCargo eau = new FCargo("nourriture", 700);

	FAstronaute Olivier = new FAstronaute ("Olivier", "pc en feu", 135, 84, "homme");
	FAstronaute Muller = new FAstronaute ("La voix de dieux", "Muller", 46, 81.3, "femme");


	Fusee monTableau[ ] = new Fusee[10];
	monTableau[0]= Satellite;
	monTableau[1]= Pain;
	monTableau[2]= PapierToilette;
	monTableau[3]= vetements;
	monTableau[4]= eau;
	monTableau[5]= Boquet;
	monTableau[6]= Humez;
	monTableau[7]= Saveant;
	monTableau[8]= Olivier;
	monTableau[9]= Muller;

	for (int i = 0; i < monTableau.length; i++)
{	
	monTableau[i].Decollage();
}

// Fusee SATURN_VI = new Fusee("SATURN VI",150000.0,200000.0,7800.0, 23.0, 6200.0, 0.38,  "Mars");
// Fusee SATURN_VII = new Fusee("SATURN VII",150000.0,200000.0,7800.0, 23.0, 6200.0, 2.53,  "Jupiter");
// Fusee SATURN_VIII = new Fusee("SATURN VIII",150000.0,200000.0,7800.0, 23.0, 6200.0, 1,  "Terre");

FCargo Fret = new FCargo("Cargaison", 100);
// Fret  =  ("La voix de dieux", "Muller", 46, 81.3, "femme");


 */

MesMaths.maxInt(3, 2);
MesMaths.maxInt(1, 2);
MesMaths.maxInt(5, 2);

System.out.print("Un cercle de 1,5 de rayon a une circonférence de " + 1.5 * MesMaths.pi);

}
}