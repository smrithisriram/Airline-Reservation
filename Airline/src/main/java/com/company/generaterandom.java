package main.java.com.company;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class generaterandom {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer Name:" + generateRandomCname());

            System.out.println("Boarding :" + generateRandomBoarding());

            System.out.println("Departure :" + generateRandomDeparture());

            System.out.println("Flight No: "+ generateFlight_No());

            System.out.println("Class Type (Economic or Business class) :" + generateRandomClass_Type());

            System.out.println("----------------------------");

        }
    }

    public static String generateFlight_No() {
        return UUID.randomUUID().toString();
    }

    public static String generateRandomCname() {
        String[] Airline_Cname = { "Ganesh", "Sheldon", "Ram", "Sita", "Rakesh","Varsha", "Sarika", "Smrithi" };
        return Airline_Cname [new Random().nextInt(Airline_Cname .length)];
    }
    public static String generateRandomBoarding() {
        String[] Airline_Boarding = {"Chicago","NewYork","France","Melbourne","Japan","Chennai","Pune","Mumbai"};
        return Airline_Boarding [new Random().nextInt(Airline_Boarding .length)];
    }

    public static String generateRandomDeparture() {
        String[] Airline_Departure = {"NewYork","France","Chicago","Melbourne","Japan","China","Italy","Delhi"};
        return Airline_Departure[new Random().nextInt(Airline_Departure .length)];
    }

    public static String generateRandomClass_Type() {
        String[] Airline_Class_type = {"Economic","Business"};
        return Airline_Class_type[new Random().nextInt(Airline_Class_type .length)];
    }


}
