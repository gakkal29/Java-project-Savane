// Fichier :     Animal.java
// Création:     
// Auteurs :      
//
// Ce code n'est pas protégé par un copyright.
// 
// Historique :
//  Créé pour le cours IFT1025 H22
//

/**
   class Animal
    implements the Prey/Predator relationship

**/

    // TO BE COMPLETED //

abstract class Animal implements ProiePredateur {
    protected int age;
    protected int ageMature;
    protected boolean proie;
    protected double facteurCroissance;
    protected double masse;
    protected int maxAge;

    @Override
    public void naitre() {

    }

    @Override
    public void vieillir() {

    }

    @Override
    public void manger() {

    }

    @Override
    public Animal accoucher() {
        return null;
    }

    @Override
    public void mourir() {

    }

    @Override
    public boolean estVivant() {
        return false;
    }

    @Override
    public boolean estMature() {
        return false;
    }

    @Override
    public void setProie(boolean proie) {
        this.proie = proie;
    }

    @Override
    public boolean estProie() {
        return false;
    }

    @Override
    public double getMasse() {
        return masse;
    }

    @Override
    public void setMasse(double masse) {
        this.masse = masse;

    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getAgeMax() {
        return maxAge;
    }

    @Override
    public int getAgeMature() {
        return ageMature;
    }
}