public class TestBBB {
    public static void main(String[] args) {
        
        // instantiate a new BigBadBat
        BigBadBat bat = new BigBadBat();

        // attack 3 towns
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        // eat 2 humans
        bat.eatHumans();
        bat.eatHumans();

        // fly 2 times
        bat.fly();
        bat.fly();
    }
}