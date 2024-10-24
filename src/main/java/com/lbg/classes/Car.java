package com.lbg.classes;

public class Car {
    // broom broom
    private String make;
    private String model;
    private int doors;
    private int mileage;
    private int year;
    private int top_speed;
    private long price;

    private double naught_60;
    private double current_speed;

    private COLOURS colour;

    public Car(String make, String model, int doors, int mileage, int year, int topSpeed, long price, double naught60, COLOURS colour) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.mileage = mileage;
        this.year = year;
        this.top_speed = topSpeed;
        this.price = price;
        this.naught_60 = naught60;
        this.colour = colour;
        this.current_speed=0.0;
    }
    public Car(){
        this.make = "Unknown";
        this.model = "Unknown";
        this.doors = 5;
        this.mileage = 0;
        this.year = 2024;
        this.top_speed = 0;
        this.price = 0;
        this.naught_60 = 10.0;
        this.colour = COLOURS.UNKNOWN;
        this.current_speed=0.0;
    }
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int getYear() {
        return this.year;
    }

    public int getTop_speed() {
        return this.top_speed;
    }
    public double getCurrent_speed() {
        return this.current_speed;
    }

    public double getPrice() {
        return (double)this.price/100;
    }

    public double getNaught_60() {
        return this.naught_60;
    }
    public COLOURS getColour() {
        return this.colour;
    }

    public void setColour(COLOURS colour) {
        this.colour = colour;
    }
    public double accelerate(double a,double t){
        this.current_speed+=a*t;
        return this.current_speed;
    }
    public double accelerate(double dv){
        this.current_speed+=dv;
        return this.current_speed;
    }
    public double decelerate(double d, double t){
        return this.accelerate(-d,t);
    }
    public double decelerate(double dv){
        return this.accelerate(-dv);
    }

}
