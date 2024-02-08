package mycarapp;


public class MyCarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BuildCar testCar1 = new BuildCar();
        BuildCar testCar2 = new BuildCar();
        
        testCar1.startTest();
        testCar1.hitGas(50);
        testCar1.hitBreak(10);
        testCar1.hitGas(20);
        testCar1.addMiles(100);
        testCar1.addMiles(20);
        testCar1.checkFuel_gauge(10);
        testCar1.changeDirection(90);
        testCar1.endTest();
        
        testCar2.hitGas(50);
        testCar2.hitGas(-10);
        testCar2.hitGas(20);
    }
}
