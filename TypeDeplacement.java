/*
 * Le type de déplacement d'une unité
 */
public enum TypeDeplacement
{
	 ROUES("roues","Les vehicules à roues ne peuvent pas aller dans les montagnes"), 
	 CHENILLES("chenilles","Les vehicules à chenilles ne peuvent ni aller dans les montagnes ni dans les forêt"),
	 PIED("pied","Les Unités à pied peuvent aller de partout sur terre"), 
	 NAVAL("naval","Les Unités navales ne peuvent aller que sur l'eau"),
	 AERIEN("aerien","Les unités aériennes peuvent aller de partout et ne sont pas influés par le terrain"), 
	 AMPHIBIE("amphibie","Les unités amphibies peuvent aller sur terre et sur l'eau");
	 
	 private String aNom;
	 private String aDescription;
	 
	 
	 TypeDeplacement(final String pNom,final String pDescription){
        aNom=pNom;
        aDescription =pDescription;
    }
    
    public String getNom(){
        return aNom;
    }
    
    public String getDescription(){
        return aDescription;
    }
}
