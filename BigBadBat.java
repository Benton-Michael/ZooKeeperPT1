public class BigBadBat extends Mammal {
    // default energyLevel of 300
    public BigBadBat() {
        super(300);
    }

    public void fly() {
        System.out.println("Flap Flap Flap - Flyin!");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("I'm a humatarian - so, well nevermind");
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Ah, ouch, this hurts. The entire town is on fire right now. Somebody stop the big bad bat!!");
        this.energyLevel -= 100;
    }
}