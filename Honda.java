package myapp;

public class Honda extends Car {
    
    // when you extend you get all the properties of the Car (the parent class)

    public Honda() {
        this.setMake("honda");

    }
    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void stop() {
        System.out.print("Stopping... stopped");
    }
}
