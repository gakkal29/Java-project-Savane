// Fichier :     Antilope.java
// Création: 2022.03.10
// Auteurs :  Jasmine Livie & Kanty Louange Gakima
//
// Ce code n'est pas protégé par un copyright.
// 
// Historique :
//  Créé pour le cours IFT1025 H22
//

/**
   class Antilope
    extends Animal

**/


public class Antilope extends Animal{
    public static final int ageMature = 2;
    static final public int AGEMAX = 15;
    private Herbe nourriture;

    public Antilope(double facteurCroissance) {
        this.facteurCroissance = facteurCroissance;
        naitre(); // appelle la methode naitre pour que toute les antilopes soit originalement vivante = true
        setProie(true);// Antilope est true pour Proie
    }

    // Override getAgeMax(), getAgemature() et setNourriture pour le mettre propre aux antilopes
    @Override
    public int getAgeMax(){
        return AGEMAX;
    }
    @Override
    public int getAgeMature(){
        return ageMature;
    }
    @Override
    public void  setNourriture(Herbe nourriture){
        this.nourriture=nourriture;
    }

}

