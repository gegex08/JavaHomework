package buildcar;

/**
 *
 * @author geneivaocampo
 */
public class BuildCar {

   {
    public static void main(String[] args)
    {
    // Create two different
    // Bicycle objects
    MyCarApp TestCar1 = new BuildCar();
    MyCarApp TestCar2 = new BuildCar();
    
    // Invoke methods on those objects
    TestCar1.changeCadence(50);
    TestCar1.speedUp(50);
    TestCar1.speedDown(10);
    TestCar1.speedUp(10);
    TestCar1.changeGear(2);
    TestCar1.printStates();

    }// end main
   }
}
