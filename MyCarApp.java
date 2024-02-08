package mycarapp;


public class MyCarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BuildCar testCar1 = new BuildCar();
        BuildCar testCar2 = new BuildCar();
        
        testCar1.testCar();
        testCar1.hitGas(50);
        testCar1.hitBreak(10);
        testCar1.hitGas(20);
        testCar1.addMiles(100);
        
        testCar2.hitGas(50);
        testCar2.hitGas(-10);
        testCar2.hitGas(20);
    }
}
