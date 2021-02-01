//package car;

/**
 *
 * @author harsh
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameofCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberofPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCar) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCar;
    }
    
    public Car() {
        
    }
    
    //Getters and Setters
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean getisTheCarOn() {
        return this.isTheCarOn;
    }

    public void printVariable() {
        System.out.println("This is the max Speed: " + maxSpeed);
        System.out.println("This is the min Speed: " + minSpeed);
        System.out.println("This is the weight: " + weight);
        System.out.println("This is the status of the car: " + isTheCarOn);
        System.out.println("This is the condition: " + condition);
        System.out.println("Name of Car: " + nameofCar);
        System.out.println("Number of People in Car: " + numberofPeopleInCar);
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {
        //if there aren't too many people in the car
        if (numberofPeopleInCar < maxNumberOfPeopleInCar){
            //someone can get in
            System.out.println("Someone got in");
            numberofPeopleInCar++;
        } else {
            //the car is full
            System.out.println("The car is full " + numberofPeopleInCar + "=" + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        //if there's someone in the car
        if (numberofPeopleInCar > 0) {
            //ask someone to get out
            numberofPeopleInCar--;
        } else {
            //otherwise no one can get out
            System.out.println("No one is in the Car " + numberofPeopleInCar);
        }
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn() {
        //If the Car isn't on 
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            //otherwise print out the fact its on
            System.out.println("The Car is already on " + isTheCarOn);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
        
    }
}
