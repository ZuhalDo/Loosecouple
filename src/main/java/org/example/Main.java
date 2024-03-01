package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Example of tight coupling - To change journey from Car to Bike, it requires
        // changes in BadTraveler class
        BadTraveler bt=new BadTraveler();
        bt.startJourney();
// Example of loose coupling - To change journey from Car to Bike, it
        // is possible without changing GoodTraveler class
        GoodTraveler gt=new GoodTraveler();

        gt.setV(new Car());// Inject Car dependency
        gt.startJourney(); // start journey by Car
        gt.setV(new Bike()); // Inject Bike dependency
        gt.startJourney();// Start journey by Bike

    }
}