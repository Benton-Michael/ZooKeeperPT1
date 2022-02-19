public class TestGorilla {


    // main method
    // instantiate the Gorilla
    public static void main(String[] args) {
        // we need a parameter here to satisfy the
        // super energyLevel that is created along
        // with the new gorilla object
        // energyLevel deafult value is 100
        Gorilla gorilla = new Gorilla(100); 
            
            // throw 3 times
            gorilla.throwSomething();
            gorilla.throwSomething();
            gorilla.throwSomething();

            // eat bananas 2 times
            gorilla.eatBananas();
            gorilla.eatBananas();

            // climb 1 time
            gorilla.climb();
        }
    }
