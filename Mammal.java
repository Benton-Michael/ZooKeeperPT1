public class Mammal {
    protected int energyLevel = 100;
    
    // Method: displayEnergy
    public int displayEnergy() {
        System.out.println("The Energy level is: " + energyLevel);
        return energyLevel;
    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}