public class Gorilla extends Mammal {
    
    // use of keyword super
    // super keyword calls a method that is above this class, 
    // in parent class (gorilla extends mammal shows
    // inheritance)

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    // each throw is -5 energy points
    public void throwSomething() {
        System.out.println("The Gorilla threw something!");
        this.energyLevel -= 5;

    }

    // each eat bananas is +10 energy points
    public void eatBananas() {
        System.out.println("OMG I love Bananas!");
        this.energyLevel += 10;

    }

    // each climb results in -10 energy points
    public void climb() {
        System.out.println("The Gorilla is up in the trees!");
        this.energyLevel -= 10;

    }
}