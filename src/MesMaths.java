public class MesMaths {
    public static int compteur;
    public static final double pi = 3.14159265359;


    
    public  static void maxInt(double prmVariableA, double prmVariableB) {
        String message ="";
        double valeurMax;
        compteur++;

        if (prmVariableA > prmVariableB){
            valeurMax = prmVariableA;
        }  else {
            valeurMax = prmVariableB;
        }

        message += "\n ----------------------------------------------------------------------";
        message += "\n La valeur la plus grande est : " + valeurMax ;
        message += "\n Vous avez utilisé la méthode maxInt : " + compteur + " fois." ;
        message += "\n ----------------------------------------------------------------------";
        System.out.println(message);
        
        
    }
}
