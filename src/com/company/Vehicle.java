package com.company;

public class Vehicle {

    private double length;
    private int seats;
    private int tires;
    private String brand;
    private int speed;

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTires() {
        return this.tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startEngine(boolean keyTurned) {
        if (keyTurned) {
            System.out.println("Engine switched on");
        } else {
            System.out.println("Please insert the key!");
        }
    }

    public void speedUp (boolean accelerate) {

        if (accelerate) {
            speed = speed+5;
            System.out.println("Current speed is " + speed + " km/h.");
        }
    }

    public void slowDown (boolean brake) {

        if (brake) {
            speed = speed-5;
            System.out.println("Current speed is " + speed + " km/h.");
        }
    }

}
