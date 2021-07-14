package com.company;

import com.sun.javafx.scene.layout.region.BackgroundPositionConverter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 1st task: Loops
        // Write a program that counts in descending order from 100 to 0; print out only the values that are
        //divisible by 6.

//        for (int i = 100; i > 0; i--) {
//            if (i%6 == 0) {
//                System.out.println(i);
//            }
//        }

        // 2nd task:
        // Write a program that take input from the user for 10 numbers and finds the average of those numbers.

//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[10];
//        float sum = 0;
//        System.out.println("Enter 10 numbers: ");
//
//        for(int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//            sum+= array[i];
//        }
//
//        System.out.println("The average of the 10 numbers you entered is " + sum/10);

        //3rd task:
        // Write a program that takes in 5 strings from the user and
        // concatenates those strings into one sentence

//        Scanner scanner = new Scanner(System.in);
//        String[] array = new String[5];
//
//        for(int i = 0; i < array.length; i++) {
//            System.out.print("Enter the next string: ");
//            array[i] = scanner.nextLine();
//        }
//        String sentence = "";
//        for(int i = 0; i < array.length; ++i) {
//            sentence = sentence + array[i] + " ";
//        }
//
//        System.out.println(sentence);

        // 4th task:
        //Write a program that takes in 10 numbers and finds the largest number.

//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[10];
//        System.out.println("Enter 10 numbers: ");
//
//        for(int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("The largest number out of the 10 values you entered is " + max);

        //5th task:
        // Using an array, output the number of odd numbers out of the numbers a user has entered.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of values: ");
//        int[] array = new int[scanner.nextInt()];
//
//        for(int i = 0; i < array.length; i++) {
//            System.out.print("Enter the next value: ");
//            array[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                sum++;
//            }
//        }
//        System.out.println("The amount of odd numbers is " + sum);

        //6th task:
        // create a class called Vehicle.
        // Features: length of the vehicle, number of seats, number of tires, name / brand, current speed
        // Methods: speed up (increases speed by 5), slow down (reduces speed by 5), start engine, stop engine.

        Vehicle vehicle = new Vehicle();
        vehicle.setLength(3.45);
        vehicle.setSeats(4);
        vehicle.setTires(4);
        vehicle.setBrand("Opel");
        vehicle.setSpeed(75);

        System.out.println("The length of the vehicle is " + vehicle.getLength() + " m.");
        System.out.println("The vehicle has " + vehicle.getSeats() + " seats.");
        System.out.println("The vehicle has " + vehicle.getTires() + " tires.");
        System.out.println("The vehicle's brand name is " + vehicle.getBrand() + " .");
        System.out.println("The speed of the vehicle is " + vehicle.getSpeed() + " km/h.");
        
        vehicle.slowDown(true);
        vehicle.speedUp(true);

    }
}
