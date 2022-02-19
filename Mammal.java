public class Mammal {
    protected int energyLevel;

    // constructor
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    // Method: displayEnergy
    public int displayEnergy() {
        System.out.println("The mammal's energy level is " + this.energyLevel);
        return this.energyLevel;
    }

    
}