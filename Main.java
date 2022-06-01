package myapp;

public class Main {
    
    public static void main(String[] args) {
        //instantiate a car

        Car myCar = new Car();
        //myCar.setColour("red");
        //myCar.make = "honda";
        //myCar.engineCapicty = 2000;

        myCar.start();

        System.out.printf("The colour of my car is %s\n", myCar.getColour());

        myCar.setColour("blue");
        System.out.printf(" I have changed colour of my car to %s\n", myCar.getColour());

        //instantiate another car

        //Car hisCar = new Car();
        //hisCar.setColour("blue");
        //hisCar.make = "toyota";
        //hisCar.engineCapicty = 2500;

        //hisCar.stop();
        public class Car {
            Car myThirdCar = new Car("silver", "subaru");
        myThirdCar.make = "subaru";
        
        }
        

        //Honda
        Honda civic = new Honda();



    }
}
