package com.company;

public class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setColor("Grey");
        myCar.setMake("Ford");
        myCar.setModel("Focus SE");
        myCar.setYear(2014);

        System.out.println("My car's color is " + myCar.getColor() + ".");
        System.out.println("My car's make is " + myCar.getMake() + ".");
        System.out.println("My car's model is " + myCar.getModel() + ".");
        System.out.println("My car's year is " + myCar.getYear() + ".");
    }
}
