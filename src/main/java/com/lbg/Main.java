package com.lbg;

import com.lbg.classes.COLOURS;
import com.lbg.classes.Car;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Car myCar = new Car("Mini","Cooper",3, 0, 2024, 108, 3499995, 6.7, COLOURS.WHITE);
        myCar.setColour(COLOURS.WHITE);
        System.out.println(myCar.getCurrent_speed());
        myCar.accelerate(12.0,5);
        System.out.println(myCar.getCurrent_speed());
        myCar.decelerate(20);
        System.out.println(myCar.getCurrent_speed());
        System.out.println(myCar.getColour());
        System.out.println(myCar.getPrice());
        Car yourCar = new Car();
        yourCar.accelerate(100);
        Car theCar = new Car();
        Car[] cars = new Car[3];
        cars[0]=myCar;
        cars[1]=yourCar;
        cars[2]=theCar;

        for(Car car:cars){
            System.out.println(car.getCurrent_speed());
            System.out.println(car.getColour());
            System.out.println(car.getDoors());
        }
    }
}